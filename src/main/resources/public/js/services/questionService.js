/**
 * Created by unamanic on 10/15/16.
 */
(function() {
    angular.module('eulerApp')
        .service('questionService', ['$resource', 'questionUrl', function($resource, questionUrl){
            var resource = $resource(questionUrl,
                { method: 'getTask', q: '*' }, // Query parameters
                {'query': { method: 'GET' }});

            var getQuestions = function(){

                var questions =  resource.query();
                return questions;
            };

            return {
                getQuestions: getQuestions
            }
        }]);
})();