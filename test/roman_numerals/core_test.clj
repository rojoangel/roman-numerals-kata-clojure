(ns roman-numerals.core-test
  (:require [clojure.test :refer :all]
            [roman-numerals.core :refer :all]))

(deftest test-arabic-to-roman-numeral-conversion
  (testing "arabic 1 is roman I"
    (is (= "I" (arabic->roman 1))))
  (testing "arabic 2 is roman II"
    (is (= "II" (arabic->roman 2))))
  (testing "arabic 3 is roman III"
    (is (= "III" (arabic->roman 3))))
  (testing "arabic 4 is roman IV"
    (is (= "IV" (arabic->roman 4))))
  (testing "arabic 5 is roman V"
    (is (= "V" (arabic->roman 5))))
  (testing "arabic 6 is roman VI"
    (is (= "VI" (arabic->roman 6))))
  (testing "arabic 7 is roman VII"
    (is (= "VII" (arabic->roman 7))))
  (testing "arabic 8 is roman VIII"
    (is (= "VIII" (arabic->roman 8)))))
