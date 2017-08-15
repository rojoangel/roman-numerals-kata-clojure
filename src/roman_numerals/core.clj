(ns roman-numerals.core)

(def arabic-to-roman-digits
  (sorted-map-by >
                 1000 "M"
                 900 "CM"
                 500 "D"
                 400 "CD"
                 100 "C"
                 90 "XC"
                 50 "L"
                 40 "XL"
                 10 "X"
                 9 "IX"
                 5 "V"
                 4 "IV"
                 1 "I"))

(defn arabic->roman
  ([arabic]
   (when (< arabic 5000)
     (arabic->roman arabic "" arabic-to-roman-digits)))
  ([arabic roman digits-to-process]
   (let [[arabic-digit roman-digit] (first digits-to-process)]
     (if (>= arabic arabic-digit)
       (recur (- arabic arabic-digit) (str roman roman-digit) digits-to-process)
       (if (> arabic 0)
         (recur arabic roman (rest digits-to-process))
         roman)))))
