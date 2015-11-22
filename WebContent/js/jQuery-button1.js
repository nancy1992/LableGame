;(function($){
	$.extend($.fn,{
		deleteLable:function(options){
		
			var self=this,
				$body=$('.J-shoping-body'),
				$close=$('.J-shoping-close');
			var S={
				init:function(){
					$close.live('click',this.removeList);
				},
				removeList:function(e){
					
					var content=$(this).parent().find(".J-shoping-list-a p a").text();
					$("#dialog").css("display", "block");

					var windowWidth = document.documentElement.clientWidth;
					var windowHeight = document.documentElement.clientHeight;
					var popupWidth = $("#dialog").width();
					var popupHeight = $("#dialog").height();
					$("#dialog").css({
						"left" : windowWidth / 2 - popupWidth / 2,
						"top" : windowHeight / 2 - popupHeight / 2,
					});

					$("#hide").val(content);
				},
			};
			S.init(); 
		}
	});	
})(jQuery);

