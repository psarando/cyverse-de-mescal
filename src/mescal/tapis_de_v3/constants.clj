(ns mescal.tapis-de-v3.constants)

(def hpc-app-type "External")
(def hpc-system-id "tapis")
(def hpc-group-description "Apps that run on HPC resources.")
(def hpc-group-name "High-Performance Computing")
(def hpc-group-id "00000000-0000-0000-0000-000000000001")
(def unknown-value "UNKNOWN")

(def hpc-group-overview
  {:id   hpc-group-id
   :name hpc-group-name})

(def limit-checks
  {:canRun  true
   :results []})
