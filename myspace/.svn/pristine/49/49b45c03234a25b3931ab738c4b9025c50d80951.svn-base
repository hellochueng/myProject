
$(function(){
	webName=webName+"/ImgLogServlet?type=";
	getImgLogAll();
})

function getImgLogAll(){
	$.ajax({
		url:webName+"getImgLogAll",
		async:false,
		cache:false,
		success:function(data){
			if(data=="1"){
				location.href="mainView.html"
			}else{
				var items=$.parseJSON(data);
				var imglog=$("#ImgLog");
				var msg="";
			}
		}
	})
}
/*
 * //初始化权限
function initRole(){
	$.ajax({
		url:webName+"getSystemsByRolesId",
		async:false,
		cache:false,
		success:function(data){
			if(data=="1")
				location.href="login.html";
			else{
				var items=$.parseJSON(data);
				var nav=$("#main-nav");
				var msg="";
				for(var i=0;i<items.length;i++){
					//查询所有父级节点
					if(items[i].pid==0){
						msg+='<li> <a href="#" class="nav-top-item"> '+items[i].name+' </a><ul>';
						//遍历父级节点下面是否有子级节点
						for(var j=0;j<items.length;j++){
							if(items[i].id==items[j].pid){
								msg+='<li><a href="javascript:openPage(&quot;'+items[j].url+'&quot;)">'+items[j].name+'</a></li>';
							}
						}
						msg+='</ul></li>';
					}
				}
				
				nav.html(msg);
			}
		}
	})
function Indexinit(){
	initRole();
	bindEvent();
}

function bindEvent(){
	$("#main-nav ul li a").live("click",function(){
		$("#main-nav ul li a").removeClass("current");
		$(this).addClass("current");
	})
}

function openPage(url){
	$.get(url+".html",{},function(data){
		$("#tab1").html(data);
	});
}


}

*/
