class DataCompare {
    private $hasCsvHead;
    private $data;

    public function readDataFromFile($nazwaPliku) {
        $fileExtension = pathinfo($nazwaPliku, PATHINFO_EXTENSION);

        if ($fileExtension === 'csv') {
            $this->hasCsvHead = true;
            $this->data = $this->parseCsvFile($nazwaPliku);
            return true;
        } else {
            return false;
        }
    }

    private function parseCsvFile($nazwaPliku) {
        $fileContent = file_get_contents($nazwaPliku);
        $lines = explode("\n", $fileContent);
        $data = [];

        foreach ($lines as $line) {
            $row = str_getcsv($line);
            $data[] = $row;
        }

        return $data;
    }

    public function writeToDataBase() {
       
        return true;
    }
}