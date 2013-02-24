import System.Environment (getArgs)

{-
    fizzBuzz

    xが3の倍数ならFizz,
    xが5の倍数ならBuzz,
    xが3と5の倍数ならFizzBuzzを返す
-}
fizzBuzz :: Int -> String
fizzBuzz x = case x of
	x | mod x 3 == 0 && mod x 5 == 0 -> "FizzBuzz"
	  | mod x 3 == 0                 -> "Fizz"
	  | mod x 5 == 0                 -> "Buzz"
	  | otherwise                    -> show x

{-
    main

    mapでリストの内容にfizzBuzzを適用し、
    返却されたリストをunwordsで空白区切りで連結して
    出力する。
-}
main = do
    args <- getArgs
    putStr . unwords $ map fizzBuzz [1..(read $ args !! 0)]
