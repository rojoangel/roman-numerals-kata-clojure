(ns roman-numerals.core)

(defn arabic->roman [arabic]
  (loop [remaining arabic
         roman ""]
    (if (= remaining 0)
      roman
      (recur (- remaining 1) (str roman "I")))))
