jQuery(document).ready(function(){
	goAjax()
	setTopNav();
	setName();
	showImgLog();
});

function returnLog(id,dom){
	//alert($(dom).prev("input").val())
	var inp = $(dom).parent().prev("input").val();
	$.ajax({
		type:"get",
		url:"/myspace/personAction/sendCmt.do",
		async : false,
		data:{"id":id,"content":inp},
		success:function(data){
			showImgLog();
		}
	});
	$(dom).parent().prev("input").val("");
}

function likerLog(id){
	$.ajax({
		type:"get",
		url:"/myspace/personAction/likeLog.do",
		data:"log_Id="+id,
		success:function(data){
				showImgLog();
		}
	});
}

function showImgLog(){
	$(".content").fadeIn();
	$.ajax({
		type:"get",
		url:"/myspace/zmhperson/getAllFriendImgLog.do",
		async : false,
		dataType:"json",
		success:function(data){
			var body="";
			for(var i =0;i<data.length;i++){
				if(data[i].is_delete==0){
					body+='<div class="msgCon"><div class="msgBox"><dl>';
					body+='<dt><img src="'+data[i].img+'" width="50" height="50"/></dt>';
					body+='<dd>'+data[i].name+'</dd><dd>'+data[i].create_time+'</dd></dl>';
					body+='<img style="margin-top: 20px" src="'+data[i].imgSrc+'" width="300" height="300"/>';
					body+='<div class="msgTxt" style="text-align: left;">'+data[i].imgLog_content+'</div><div id="buttom"></div>';
					body+='<div style="margin-top: 10px;line-height:35px;"><a style="float:left" href="javaScript:likerLog('+data[i].id+')"><img src="all/images/likes.png"/></a><p>';
					if(data[i].logLiker_list.length>0){
						var x=0;
						for(var j=0;j<data[i].logLiker_list.length;j++){
							if(data[i].logLiker_list[j].is_delete==0){
								body+=data[i].logLiker_list[j].name+',';
								x++;
							}
						}
						body+=x+'等人觉得很赞';
					}
					body+='</p></div><div class="content" >';
					for(var j=0;j<data[i].imgLogCmt_list.length;j++)
						if(data[i].imgLogCmt_list[j].is_delete==0){
							body+='<dl><dt><img src="'+data[i].imgLogCmt_list[j].img+'" width="30" height="30"/></dt>';
							body+='<dd>'+data[i].imgLogCmt_list[j].name+'：'+data[i].imgLogCmt_list[j].comment_content+'</dd></dl>';
						}
					body+='</div><div id="content" ><ul><li><div class="input-group" style="width:100%"><input type="text"  class="form-control bigInput" /><span class="input-group-btn">';
					body+='<button class="btn btn-default" onclick="returnLog('+data[i].id+',this)" type="button">回复</button></span>';
					body+='</div></li></ul></div></div></div>';
				}
			}
			$("#showImgLog").html(body);
		}
	});
}

