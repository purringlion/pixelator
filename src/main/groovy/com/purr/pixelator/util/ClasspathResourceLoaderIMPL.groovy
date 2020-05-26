package com.purr.pixelator.util

final class ClasspathResourceLoaderIMPL implements ClasspathResourceLoader {

    //TODO can/should this be static?
    @Override
    String getPathOfResource(String filepath) {
        // TODO this has to be inefficient, find a better way
        ClassLoader classloader = ClassLoader.getSystemClassLoader()
        String path = classloader.getResource(filepath).getPath()
        return path
    }
}
