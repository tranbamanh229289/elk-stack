# planck

docker exec -it <id elasticsearch> bash
bin/elasticsearch-setup-passwords interactive

hoặc

curl -XPOST -D- 'http://localhost:9200/_security/user/elastic/_password' \
    -H 'Content-Type: application/json' \
    -u elastic:[your current elastic password] \
    -d '{"password" : "[your new password]"}'
