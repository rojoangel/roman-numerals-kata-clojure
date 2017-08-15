(ns roman-numerals.core)

(def arabic-to-roman-digits
  {90 "XC"
   50 "L"
   40 "XL"
   10 "X"
   9 "IX"
   5 "V"
   4 "IV"
   1 "I"})

(defn arabic->roman
  ([arabic]
   (arabic->roman arabic "" arabic-to-roman-digits))
  ([arabic roman digits-to-process]
   (let [[arabic-digit roman-digit] (first digits-to-process)]
     (if (>= arabic arabic-digit)
       (recur (- arabic arabic-digit) (str roman roman-digit) digits-to-process)
       (if (> arabic 0)
         (recur arabic roman (rest digits-to-process))
         roman)))))
