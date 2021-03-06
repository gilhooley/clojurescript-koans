(ns koans.meditations.creating-functions)

(def koans '(
  "One may know what they seek by knowing what they do not seek"
  (= [:__] (let [not-a-symbol? (complement symbol?)]
                  (map not-a-symbol? [:a 'b "c"])))

  "Praise and 'complement' may help you separate the wheat from the chaff"
  (= [:wheat "wheat" 'wheat]
       (let [not-nil? :__]
         (filter not-nil? [nil :wheat nil "wheat" nil 'wheat nil])))

  "Partial functions allow procrastination"
  (= 20 (let [multiply-by-5 (partial * 5)]
          (:__)))

  "Don't forget: first things first"
  (= [:__]
       (let [ab-adder (partial concat [:a :b])]
         (ab-adder [:__])))

  "Functions can join forces as one 'composed' function"
  (= 25 (let [inc-and-square (comp square inc)]
          (inc-and-square :__)))

  "Have a go on a double dec-er"
  (= :__ (let [double-dec (comp dec dec)]
          (double-dec 10)))

  "Be careful about the order in which you mix your functions"
  (= 99 (let [square-and-dec :__]
          (square-and-dec 10)))
))

(def fns [
  '(defn square [x] (* x x))
])
