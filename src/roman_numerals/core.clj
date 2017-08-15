(ns roman-numerals.core)

(defn arabic->roman [arabic]
  (loop [remaining arabic
         roman ""]
    (if (= remaining 5)
      (recur (- remaining 5) (str roman "V"))
      (if (= remaining 4)
        (recur (- remaining 4) (str roman "IV"))
        (if (= remaining 0)
          roman
          (recur (- remaining 1) (str roman "I")))))))
