(ns euler.core)

(defn problem-1
  "Find the sum of all the multiples of 3 or 5 below n"
  [n]
  (reduce + (filter #(or (zero? (rem % 3)) (zero? (rem % 5))) (take n (iterate inc 0)))))

(defn problem-2
  "By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms."
  [n]
  (reduce + (filter #(even? %) (take-while (partial >= n) (map first (iterate (fn [[a b]] [b (+ a b)]) [0N 1N]))))))