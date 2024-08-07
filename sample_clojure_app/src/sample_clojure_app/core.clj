(ns sample-clojure-app.core)

(defn fibs-work [n i fs]
  (if (= i n)
    fs
    (fibs-work n (inc i) (conj fs (apply + (take-last 2 fs))))))
(defn fibs [n]
  (cond
    (< n 1) []
    (= n 1) [1]
    :else (fibs-work n 2 [1 1])))

(defn fibre [n]
  (cond
    (< n 1) nil
    (<= n 2) 1
    :else (+ (fibre (dec n)) (fibre (- n 2)))))

(defn fibsre [n]
  (map fibre (range 1 (inc n))))