'use strict';

module.exports = function (grunt) {
  require('load-grunt-tasks')(grunt);

  grunt.initConfig({
    kevoree: {
      main: {
        options: {
          runtime: 'next'
        }
      }
    },

    kevoree_genmodel: {
      main: {
        options: {}
      }
    },

    kevoree_registry: {
      main: {
        src: 'kevlib.json',
        options: {}
      }
    }
  });

  grunt.registerTask('default', 'model');
  grunt.registerTask('model', 'kevoree_genmodel');
  grunt.registerTask('publish', ['kevoree_genmodel', 'kevoree_registry']);
  grunt.registerTask('kev:run', ['model', 'kevoree']);
  grunt.registerTask('kev', 'kev:run');
};
