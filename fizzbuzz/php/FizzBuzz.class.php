<?php
class FizzBuzz {
    public static function printFizzBuzz($end) {
        for($i =1; $i <= $end; $i++) {
            echo self::_fizzBuzz($i) . ' ';
        }
    }

    private static function _fizzBuzz($num) {
        if($num % 15 === 0) {
            $ret = 'FizzBuzz';
        } else if ($num % 3 === 0) {
            $ret = 'Fizz';
        } else if ($num % 5 === 0) {
            $ret = 'Buzz';
        } else {
            $ret = $num;
        }

        return $ret;
    }
}
?>
