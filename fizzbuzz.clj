(defn eDivisivel? [number divisor] (= 0 (mod number divisor)))

(defn fizzbuzz? [number]
  (cond (and 
  (eDivisivel? number 3) (eDivisivel? number 5)) "fizzbuzz"
  (eDivisivel? number 3) "fizz" 
  (eDivisivel? number 5) "buzz" 
   :else number))