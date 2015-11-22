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
					$(this).parent().parent().remove();
					/*var content=$(this).parent().find(".J-shoping-list-a p").text();
					alert(content);*/
				},
			};
			S.init(); 
		}
	});	
})(jQuery);

