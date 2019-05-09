function testGetData() {
    $.ajax({
        method: "POST",
        url: "/taotao-manager-web/test/getItemInfo",
        dataType: "json",
        success: function(data){
            console.log(data);
            $("#showDiv").html(data);
        }
    });
}

$("#test").click(function() {
    $.ajax({
        method: "POST",
        url: "/taotao-manager-web/test/getItemInfo",
        dataType: "json",
        success: function(data){
            console.log(data);
            $("#showDiv").html(data);
        }
    });
});