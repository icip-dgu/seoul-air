<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">

<style>
    .left-box {
        float: left;
        width: 50%;
    }
</style>

<head></head>

<body>

<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBcNU3xUtfkL6exAXrn918Uux2cx3DDIJA"></script>
<script type="text/javascript">

    var map;
    var myCenter = new google.maps.LatLng(37.554117, 126.988480);


    // data to json
    // save in list
    // show view dynamically
    function test() {

        var list = new Array();


        <c:forEach items="${districts}" var="item">

        //parsing for string to json object
        var str = "${item}".substring(8);
        str = str.replace(/=/g, ":");
        var temp = JSON.stringify(eval("(" + str + ")"))
        var district = JSON.parse(temp);

        //save data in list
        list.push(district);
        </c:forEach>


        //tes
        for (var i in list) {
            var CARBON = JSON.parse(list[i].CARBON)
            console.log(CARBON);
        }


        // view
        document.getElementById('MSRDATE').innerHTML = list[0].MSRDATE;
        document.getElementById('MSRADMCODE').innerHTML = list[0].MSRADMCODE;
        document.getElementById('MSRSTENAME').innerHTML = list[0].MSRSTENAME;
        document.getElementById('MAXINDEX').innerHTML = list[0].MAXINDEX;
        document.getElementById('GRADE').innerHTML = list[0].GRADE;
        document.getElementById('POLLUTANT').innerHTML = list[0].POLLUTANT;
        document.getElementById('NITROGEN').innerHTML = list[0].NITROGEN;
        document.getElementById('OZONE').innerHTML = list[0].OZONE;
        document.getElementById('CARBON').innerHTML = list[0].CARBON;
        document.getElementById('SULFUROUS').innerHTML = list[0].SULFUROUS;
        document.getElementById('NITROGEN').innerHTML = list[0].NITROGEN;
        document.getElementById('PM10').innerHTML = list[0].PM10;
        document.getElementById('PM20').innerHTML = list[0].PM20;


    }

    //INIT
    function initialize() {
        var mapProp = {
            center: myCenter,
            zoom: 12,
            mapTypeId: google.maps.MapTypeId.ROADMAP
        };
        map = new google.maps.Map(document.getElementById("googleMap"), mapProp);
        google.maps.event.addListener(map, 'click', function (event) {
            placeMarker(event.latLng);
            return event;
        });
    }


    //MARKER
    function placeMarker(location) {

        // check that what district is clicked
        test();

        var marker = new google.maps.Marker({
            position: location,
            map: map
        });


        var infowindow = new google.maps.InfoWindow({
            content: 'Latitude: ' + location.lat() + '<br>Longitude: ' + location.lng()
        });

        infowindow.open(map, marker);

    }

    google.maps.event.addDomListener(window, 'load', initialize);


</script>


<h2>Seoul Air Project</h2>

<div class='left-box' id="googleMap" style="width:700px;height:700px;">왼쪽</div>

<div>
    <h1> District Air Info</h1>
    <span id='MSRDATE'></span><br>
    <span id='MSRADMCODE'></span><br>
    <span id='MSRSTENAME'></span><br>
    <span id='MAXINDEX'></span><br>
    <span id='GRADE'></span><br>
    <span id='POLLUTANT'></span><br>
    <span id='NITROGEN'></span><br>
    <span id='OZONE'></span><br>
    <span id='CARBON'></span><br>
    <span id='SULFUROUS'></span><br>
    <span id='PM10'></span><br>
    <span id='PM20'></span><br>
</div>

<script type="text/javascript" src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>

</html>