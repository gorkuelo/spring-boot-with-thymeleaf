$(document).ready(function(){
    $.fn.search = function(){
        alert('You have successfully defined the function!'); 
        $.get( "searchWithFilter", function( data ) {
        	  //$( ".result" ).html( data );
        	  alert( "Load was performed." );
        	});
    }
    $("#searchButton").click(function(){
        $.fn.search();
    });
});