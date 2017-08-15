(ns roman-numerals.core)

(def roman-for
  {5 "V"
   4 "IV"
   1 "I"})

(defn arabic->roman [arabic]
  (loop [remaining arabic
         roman ""]
    (if (>= remaining 5)
      (recur (- remaining 5) (str roman (get roman-for 5)))
      (if (>= remaining 4)
        (recur (- remaining 4) (str roman (get roman-for 4)))
        (if (>= remaining 1)
          (recur (- remaining 1) (str roman (get roman-for 1)))
          roman)))))
