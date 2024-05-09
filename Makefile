REPO_URL=retex-iconic/iconic.xr.xrmsledger
PROFILE=github
RELEASE_TYPE=java-bom
release-init:

	release-please bootstrap \
  		--token=$(GH_TOKEN) \
  		--repo-url=$(REPO_URL) \
  		--release-type=$(RELEASE_TYPE) 


release-pr:
  
	release-please release-pr \
		--token=$(GH_TOKEN) \
		--repo-url=$(REPO_URL) \
	    --release-type=$(RELEASE_TYPE) 

merge-pr:

	gh pr merge release-please--branches--main -m -d 

publish:

	release-please github-release \
		--token=$(GH_TOKEN) \
		--repo-url=$(REPO_URL) 

merge-publish: merge-pr publish

package:

	mvn clean package 

deploy:

	git pull
	mvn deploy -P$(PROFILE) -s .mvn/settings.xml 


fmt:
	mvn com.spotify.fmt:fmt-maven-plugin:format	

axon-server:

	docker compose up

dapr-run:
	
	dapr run --app-id "iconic-xrmsledger" --app-port "8082" --app-max-concurrency "1" --app-protocol "http" --components-path ".components" --dapr-grpc-port "3602" --dapr-http-port "3601" --metrics-port "3690"
