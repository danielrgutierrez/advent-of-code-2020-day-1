(ns day-1.core
  (:gen-class))

(defn part-1
  "For a list of numbers, find the two numbers that sum to 2020 and return their product"
  [list]
  (first (for [x list y list :when (= (+ x y) 2020)] (* x y))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
