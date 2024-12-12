// Vulnerable PHP code snippet
<?php
    $lang = $_GET['lang'];
    include($lang . '.php');

    $cmd = $_GET['cmd'];
    exec($cmd);
?>
