$(document).ready(function(){
    $.fn.search = function(){ 
        alert('You have successfully defined the function!'); 
    }
    $("#search").click(function(){
        $.fn.search();
    });
});