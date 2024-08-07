(ns sample-clojure-app.core-test
  (:require [clojure.test :refer :all]
            [sample-clojure-app.core :refer :all]))

(deftest fibs-work-test
  (testing "FIXME, I fail."
    (is (= fibs 15 [1 1 2 3 5 8 13 21 34 55 89 144 233 377 610]))))