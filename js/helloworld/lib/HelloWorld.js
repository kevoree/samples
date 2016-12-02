'use strict';

var AbstractComponent = require('kevoree-entities/lib/AbstractComponent');

/**
 * Prints &#34;Hello World!&#34; and &#34;Bye World!&#34;
 *
 * @type {HelloWorld}
 */
module.exports = AbstractComponent.extend({
  toString: 'HelloWorld',
  tdef_version: 1,

  /**
   * Called when your component starts
   *
   * @param {Function}     done call this when you are done starting
   *                            done(): all good
   *                            done(error): something went wrong
   */
  start: function (done) {
    this.log.info(this.toString(), 'Hello World!');
    done();
  },

  /**
   * Called when your component stops
   *
   * @param {Function}     done call this when you are done stopping
   *                            done(): all good
   *                            done(error): something went wrong
   */
  stop: function (done) {
    this.log.info(this.toString(), 'Bye World!');
    done();
  }
});
