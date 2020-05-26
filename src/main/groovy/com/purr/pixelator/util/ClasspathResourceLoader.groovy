package com.purr.pixelator.util

interface ClasspathResourceLoader {

    /**
     * Gets the usable path of an asset stored in the resources folder
     * @param filepath "file.file"
     * @return classpath to "/resources/file.file"
     */
    String getPathOfResource(String filepath)

}