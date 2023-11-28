$(document).ready(function() {


    $("#search-btn").click(function () {
        let query = $("search-box").val();
        $.get("/apis/user/search?query=" + query, function (data) {
            console.log("data=" + data);

            let title = data.title;
            let category = data.category;
            let addr = data.addr;
            let roadAddr = data.roadAddr;
            let homepage = data.homepage;
            let imgUrl = data.imgUrl;

            $("#image").attr("src", imgUrl);
            $("#title").text(title);
            $("#category").text(category);
            $("#addr").text(addr);
            $("#road-addr").text(roadAddr)
            $("#homepage").text(homepage);

            $("#add-btn").attr("data-title", title);
            $("#add-btn").attr("data-category", title);
            $("#add-btn").attr("data-roadAddr", title);
            $("#add-btn").attr("data-homepage", homepage);

            $("#result").attr("style", "visible");
        });
    });
    $("add-btn".click(function(){

    }))
});
