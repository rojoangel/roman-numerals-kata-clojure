(ns roman-numerals.core-test
  (:require [clojure.test :refer :all]
            [roman-numerals.core :refer :all]))

(deftest test-arabic-to-roman-numeral-conversion
  (testing "arabic 1 is roman I"
    (is (= "I" (arabic->roman 1))))
  (testing "arabic 2 is roman II"
    (is (= "II" (arabic->roman 2))))
  (testing "arabic 3 is roman III"
    (is (= "III" (arabic->roman 3)))))
