(ns roman-numerals.core)

(defn arabic->roman [arabic]
  (if (= arabic 3)
    "III"
    (if (= arabic 2)
      "II"
      (if (= arabic 1)
        "I"))))
