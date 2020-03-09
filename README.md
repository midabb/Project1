# Project1

# Requirements
  - Elasticsearch
  - Apache Tomcat Server
  - Postman
# Required adjustments
  In SdnListUtils class path to local folder where you want to download sdn list has to be provided in following format:
    /path/to/local/folder/filename.xml.
  The same path will be used for reading data.
  
# Methods description
  - all() - returns all entries from index
  - name() - querying entries by last name
  - refresh() - downloads latest version of sdn.xml from provided url and update index
