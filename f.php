// Vulnerable code
// $file = $_GET['file'];
// include($file . '.php');

// Fixed code
$file = filter_var($_GET['file'], FILTER_SANITIZE_STRING);
$allowedFiles = array('file1', 'file2', 'file3'); // whitelist
$fileExtension = '.php'; // only allow PHP files

if (in_array($file, $allowedFiles)) {
    $filePath = __DIR__ . DIRECTORY_SEPARATOR . $file . $fileExtension;
    if (file_exists($filePath)) {
        include($filePath);
    } else {
        echo 'File not found';
    }
} else {
    echo 'Invalid file';
}
