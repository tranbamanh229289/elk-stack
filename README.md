# planck

docker exec -it <id elasticsearch> bash
bin/elasticsearch-setup-passwords interactive

hoặc

curl -XPOST -D- 'http://localhost:9200/_security/user/elastic/_password' \
    -H 'Content-Type: application/json' \
    -u elastic:[your current elastic password] \
    -d '{"password" : "[your new password]"}'
    
curl -XPOST -D- 'http://localhost:9200/_security/user/kibana_system/_password' \
    -H 'Content-Type: application/json' \
    -u elastic:Tranmanh229 \
    -d '{"password" : "Tranmanh229"}'

curl -XPOST -D- 'http://localhost:9200/_security/user/logstash_system/_password' \
    -H 'Content-Type: application/json' \
    -u elastic:Tranmanh229 \
    -d '{"password" : "Tranmanh229"}'

