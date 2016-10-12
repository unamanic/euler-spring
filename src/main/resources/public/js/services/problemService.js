/**
 * Created by unamanic on 10/11/16.
 */
(function() {
    angular.module('eulerApp')
        .service('problemService', ['$http', '$q', function($http, $q){
            var fetchProblem = function(problem){
                var deferred = $q.defer();

                $http.get(problem + "/")
                    .then( function (data) {
                        deferred.resolve(data.data);
                    }, function (data) {
                        deferred.reject(data);
                    });
                return deferred.promise;
            };

            var fetchAnswer = function(problem, limit){
                var deferred = $q.defer();

                $http.get(problem + '/' + limit)
                    .then(function(data){
                        deferred.resolve(data.data);
                    }, function (data) {
                        deferred.reject(data);
                    });

                return deferred.promise;
            };

            return {
                fetchProblem: fetchProblem,
                fetchAnswer: fetchAnswer
            }
        }]);
})();