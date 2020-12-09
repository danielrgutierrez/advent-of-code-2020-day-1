(ns day-1.core
  (:require [clojure.java.io :as io])
  (:gen-class))

(defn part-1
  "For a list of numbers, find the two numbers that sum to 2020 and return their product"
  [list]
  (first (for [x list y list :when (= (+ x y) 2020)] (* x y))))

(defn -main
  "Reads the specified file and finds the solution."
  [filename]
  (with-open [rdr (io/reader filename)]
    (doall (part-1 (line-seq rdr)))))
