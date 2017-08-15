(ns roman-numerals.core)

(defn arabic->roman [arabic]
  (case arabic
    3 "III"
    2 "II"
    1 "I"))
