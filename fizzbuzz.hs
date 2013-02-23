fizzbuzz x = case x of
	x | mod x 3 == 0 && mod x 5 == 0 -> "FizzBuzz"
	  | mod x 3 == 0                 -> "Fizz"
	  | mod x 5 == 0                 -> "Buzz"
	  | otherwise                    -> x

main = do
    -- putStrLn "hello, world"  
    putStrLn (fizzbuzz 10)
