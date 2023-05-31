class LibCss {
    public function loadLib($nazwa, $typ, $wersja) {
        if ($typ === 'script') {
            return $this->loadScript($nazwa);
        } elseif ($typ === 'stylesheet') {
            return $this->loadStylesheet($nazwa);
        } else {
            return "Nieobsługiwany typ";
        }
    }

    private function loadScript($nazwa) {
        if ($nazwa === 'skrypt.js') {
            return "Plik skrypt.js został załadowany";
        } else {
            return "Plik skrypt.js nie istnieje";
        }
    }

    private function loadStylesheet($nazwa) {
        if ($nazwa === 'arkusz.css') {
            return "Plik arkusz.css został załadowany";
        } else {
            return "Plik arkusz.css nie istnieje";
        }
    }
}