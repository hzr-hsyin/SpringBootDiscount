<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Discount Succesful</title>
    <link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">
</head>

<body>
<div id="apply" title="" style="display:none;">
    <p>
        Uygulanan Indirim Oraniniz : % ${yourdiscountrate}
    </p>
</div>

<!-- Script -->
<script src="https://code.jquery.com/jquery-2.1.4.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>

<script>
    $(function(){
        // sayfa açılışında dialog kutusunun gelmesi için her hangi bir buton için yerleştirmedik
        $("#apply").dialog({
            width:600, //dialog kutusunun genişliği
            modal:true, //arkaplanın koyu olması
            autoOpen:true, //gerek yok ama otomatik açılması için
            position:  { my: "center top", at: "center top" } //konum
        });
    })

</script>
</body>
</html>