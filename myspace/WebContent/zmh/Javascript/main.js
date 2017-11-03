$(function(){
	
	$.get("/myspace/zmhperson/show",{},function(data){
		var person=$.parseJSON(data)	
		var msg=person.space
		var id=person.id
		var age=new Date().getFullYear()-new Date(person.birthday).getFullYear();
		$("#span").html(msg)
		$("#showname").html(person.name+"的空间"+'&nbsp;&nbsp;&nbsp;'+person.sex+'&nbsp;&nbsp;&nbsp;'+person.birthday)
	    $("#showother").html("个性签名:"+person.signature)
	    
	    $("#allmessage").html('<h1>个人资料</h1><br/>'+"QQ账号:"+person.space+'<br/>'+"姓名:"+person.name+'<br/>'+"性别:"+person.sex+'<br/>'
	    		+"生日:"+person.birthday+'<br/>'+"年龄:"+age)
	     
	    		
		$.get("/myspace/zmhperson/showImgLog",{"id":id},function(data){	
			
			var items=$.parseJSON(data)
			var msg1="";
			for(var i=0;i<items.length;i++){
				msg1+=items[i].imgLog_content+"&nbsp;&nbsp;&nbsp;"+items[i].create_time+'<br/>'				
			}
			$("#showImgLog").html('<h1>全部说说</h1><br/>'+msg1)
		})
		
		$.get("/myspace/zmhperson/showAldum",{"id":id},function(data){
			
			var items=$.parseJSON(data)
			var msg2="";
			var Aldummsg=""
			for(var i=0;i<items.length;i++){
		
			  //msg2+='<a id="'+items[i].id+'" value="'+items[i].id+'" href="#">'+items[i].aldumName+'</a>' +"&nbsp;&nbsp;&nbsp;"+items[i].create_time+'<br/>'				
			  msg2+='<div class="image-box"><div class="photo-cover"><img src="aldumImg/tiger.jpg" width="166px" height="106px" /><p class="photo-name"><a href="javascript:getPicture('+items[i].id+')" >'+items[i].aldumName+'</a><br>'+items[i].create_time+'</p></div></div>'	
			  
			  Aldummsg+='<option value="'+items[i].id+'">'+items[i].aldumName+'</option>'+'<br>'
			  $("#select").html(Aldummsg)
			}
			
			 $("#showAldum").html('<h1>全部相册</h1><br/>'+msg2)
			 $("#selectAldumId").val(items[0].id)
			 
	       
	          $("#select").change(function(){
	 	        	var aldumId=$("#select").attr("value")	 	 
	 	        	$("#selectAldumId").val(aldumId)
	 	        	$.get("/myspace/zmhperson/newAldum",{"aldumNmae":aldumName})
	 	      })
	       
	 	      $("#newAldum").click(function(){
	 	    	$("#newAldumMessage").show();
	 	    	 var aludmNmae=$("#aldumName").val();
	 	    	 var personId=$("#personId").val(person.id)
	 	      })
			
	 	    
		})
	 })
	
	
		$("#hide").click(function(){
			$("#allmessage").show();
			$("#showImgLog").hide();
			$("#showAldum").hide();
			$("#showPicture").hide();
		});
	
		$("#hideImgLog").click(function(){
			$("#showImgLog").show();
			$("#allmessage").hide();
			$("#showAldum").hide();
			$("#showPicture").hide();
		})
		
		$("#hideAldum").click(function(){
			$("#showImgLog").hide();
			$("#allmessage").hide();
			$("#showAldum").show();
			$("#showPicture").hide();
	   })
	
	 
	 
}) 
 function getPicture(id){
		
		 $.get("/myspace/zmhperson/showPicture",{"id":id},function(data){
			
	    	   var pictures=$.parseJSON(data)
	    	   var msg3="";
	    	   for(var i=0;i<pictures.length;i++){	
	  		   // alert(pictures[i].picture)
	    		   msg3+='<div class="image-box"><div class="photo-cover"><a href=aldumImg/'+pictures[i].picture+'.jpg  class="big-image"><img src="aldumImg/'+pictures[i].picture+'.jpg" width="166px" height="106px" /><p class="photo-name">'+pictures[i].create_time+'</p></div></div>'		    	    
	    	   }
	    	 $("#showPicture").html(msg3)
	    	 
    	 })	    	
    	 $("#showPicture").show();
  } 
