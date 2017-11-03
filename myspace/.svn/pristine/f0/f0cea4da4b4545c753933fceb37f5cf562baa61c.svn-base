$(function(){
	//var webName="/myspace/zfl"
	selectPerson(7,1);
	page1();
})

    function page1(){
        $("#page").Page({
      totalPages: 3,//分页总数
      liNums: 3,//分页的数字按钮数(建议取奇数)
      activeClass: 'activP', //active 类样式定义
      callBack : function(page){
            //console.log(page)
    	  selectPerson(7,page);
      }
  });
       
 }

function page2(){
    $("#page").Page({
  totalPages: 3,//分页总数
  liNums: 3,//分页的数字按钮数(建议取奇数)
  activeClass: 'activP', //active 类样式定义
  callBack : function(page){
        //console.log(page)
	  selectLog(7,page);
  }
});
   
}

function all(){
	$("table").html();
	var mes="";
	 mes+="<thead>"
	 mes+="<tr>";
	mes+="<td class='w15'>用户ID</td>";
	 mes+=" <td class='w15'>用户姓名</td>";
	 mes+="<td class='w15'>用户账号</td>";
	 mes+="<td class='w15'>用户密码</td>";
	mes+="<td class='w15'>性别</td>";
	mes+="<td class='w15'>生日</td>";
	mes+="<td class='w15'>创建时间</td>";
	mes+="</tr>";
	mes+="</thead>";
	 mes+="<tbody>";
	 mes+="</tbody>";
	 mes+="</table>";
	 $("table").html(mes);
	selectPerson(5,1);
	$("#page").show();
	page();
}
function selectPerson(pagesize,pageindex){
	//$("tbody").html();
	$.ajax({
		url:"/myspace/zfl/selectperson/"+pagesize+"/"+pageindex,
		async:false,
		//dataType:"json",
		success:function(data){
			var list=$.parseJSON(data);
			var mes="";
			for(var i=0;i<list.length;i++){
				mes +="<tr>";
				mes +="<td>"+list[i].id+"</td>";
				mes +="<td>"+list[i].name+"</td>";
				mes +="<td>"+list[i].space+"</td>";
				mes +="<td>"+list[i].pwd+"</td>";
				mes +="<td>"+list[i].sex+"</td>";
				mes +="<td>"+list[i].birthday+"</td>";
				mes +="<td>"+list[i].create_time+"</td>";
				mes +="</tr>";
			}
			$("tbody").html(mes);
		}
	})
}

function selectFriend(){
	$("table").html("");
	$("#page").hide();
	var mes="用户ID:<input type='text' id='id' ><input type='button' value='搜索' onclick='doSelect()'>";
	$("table").html(mes);
}
function doSelect(){
	var id=$("#id").val();
	if(id==""){
		swal('OMG','用户名不能为空','warning');
		//alert("请输入有效的的ID号！");
	}else{
		$.ajax({
			url:"/myspace/zfl/selectfriend/"+id,
			async:false,
			//dataType:"json",
			success:function(data){
				if(data=="[]"){
					swal('OMG','该好友不存在','error');
				}else{
					$("table").html("");
					var list=$.parseJSON(data);
					
					var mes="<tr><td>好友ID</td><td>好友备注</td><td>创建时间</td></tr>";
					for(var i=0;i<list.length;i++){
						mes +="<tr>";
						mes +="<td>"+list[i].friend_id+"</td>";
						mes +="<td>"+list[i].remark+"</td>";
						mes +="<td>"+list[i].create_time+"</td>";
						mes +="</tr>";
						}
					$("table").html(mes);
				}
			}
		})
	}
}

function selectLog(pagesize,pageindex){
	$("table").html();
	$.ajax({
		url:"/myspace/zfl/selectlog/"+pagesize+"/"+pageindex,
		async:false,
		//dataType:"json",
		success:function(data){
			var list=$.parseJSON(data);
			var mes="";
			 	mes+="<thead><tr><td class='w15'>用户ID</td><td class='w15'>用户姓名</td><td class='w15'>说说创建时间</td><td class='w15'>说说内容</td><td class='w15'>说说图片</td><td class='w15'>说说评论</td><td class='w15'>说说点赞</td></tr></thead>";
			for(var i=0;i<list.length;i++){
				mes +="<tbody><tr>";
				mes +="<td>"+list[i].id+"</td>";
				mes +="<td>"+list[i].name+"</td>";
				mes +="<td>"+list[i].create_time+"</td>";
				mes +="<td>"+list[i].imgLog_content+"</td>";
				/*for(var j=0;j<list[i].logImg_list.length;j++)
					mes +=""+list[i].logImg_list[j].logImg;*/
				mes +="<td>"+list[i].imgSrc+"</td>";
				
				mes +="<td>";
				for(var j=0;j<list[i].imgLogCmt_list.length;j++)
					mes +=""+list[i].imgLogCmt_list[j].comment_content+"  "+list[i].imgLogCmt_list[j].create_time+"";
				mes +="</td>";
				mes +="<td>";
				for(var j=0;j<list[i].logLiker_list.length;j++)
					mes +="  "+list[i].logLiker_list[j].friend_id+" "+list[i].logLiker_list[j].name+" "+list[i].logLiker_list[j].create_time+"";
				mes +="</td>";
				mes +="</tr></tbody>";
			}
			$("table").html(mes);
			$("#page").show();
			page2();
		}
	})
}

