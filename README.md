Gravina Demo Dropwizard Asset Bundle App
=========================================

__[See an in depth demo](https://www.gunnargissel.com)__

What
------

Gravina is a very small Dropwizard app with an echo service and the ability to host static assets from outside of its jar.

Why
------

It is convenient to deploy static assets separately from an api server, and sometimes having the api server host the static assets is more convenient than messing with proxies

How
-----

Build this app server with `mvn package`

Configure the app server by editing `app.yml`.  The target hosting directory is controlled by these settings;

      overrides:
        /: /tmp
        
Run the app from inside the project's root directory with `java -jar target\gravina-1.0.jar server app.yml`

__[See an in depth demo](https://www.gunnargissel.com)__