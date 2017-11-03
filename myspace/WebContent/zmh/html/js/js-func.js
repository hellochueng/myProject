$(function(){ 
	
	if($.browser.msie && $.browser.version.substr(0,1) == 6){
		$('span.drag-pointer').each(function(){  
			var container = $(this).parent().html();
			$(this).parent().html('').append('<div class="box-holder"></div>').find('.box-holder').html(container);
		});
	}
	
		$(".big-image").fancybox({
		'transitionIn'	: 'elastic',
		'transitionOut'	: 'elastic',
		'easingIn'      : 'easeOutBack',
		'easingOut'     : 'easeInBack',
		'overlayColor'	: '#000',
		'overlayOpacity' : '0.7'
	});
	
	$('.image-box, .user-box').draggable({ 
		cursor: "move",
		containment: "body",
		handle: "span.drag-pointer"
	});
	
	$('#main .image-box, #main .user-box').draggable({stack: "#main .image-box, #main .user-box"});
	
	$( "#sortable" ).sortable({
		revert: true
	});
	
	
});