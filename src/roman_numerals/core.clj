(ns roman-numerals.core)

(def arabic-to-roman-digits
  {5 "V"
   4 "IV"
   1 "I"})

(defn arabic->roman [arabic]
  (let [roman ""]
    (loop [remaining arabic
           roman roman]
      (if (>= remaining 5)
        (recur (- remaining 5) (str roman (get arabic-to-roman-digits 5)))
        (if (>= remaining 4)
          (recur (- remaining 4) (str roman (get arabic-to-roman-digits 4)))
          (if (>= remaining 1)
            (recur (- remaining 1) (str roman (get arabic-to-roman-digits 1)))
            roman))))))
