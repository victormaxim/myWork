$json = Get-Content '20181002113556-sitecore.dev.corp.lego.com-api-catalogconnector-v1.json' | Out-String | ConvertFrom-Json
$foo = New-Object FooObject
$foo.AA = $json.Foo

Write-Host ''

#$foo.BB = $json.Bar
#$foo.CC = $json.Baz
#
#20181002113556-sitecore.dev.corp.lego.com-api-catalogconnector-v1.json
#param (
#	$ImageWorkingDir = '/src',
#	$BaseUrl = 'http://sitecore.dev.corp.lego.com/api/catalogconnector/v1',
#	$zapProxy ='http://localhost:8081',
#	$outFile = "$env:CI_PROJECT_DIR/output/harDump.har"
#)
#
#
#
#try {
#
#
#	function SendWebRequest ($proxy, $url) {
#		Write-Host "Sending request to: $url"
#		$web = New-Object Net.WebClient
#		$web.Proxy = $proxy
#		$web.DownloadString($url)
#		Write-Host ''
#	}
#
#
#	Write-Host 'Starting ZAP'
#	$password = ConvertTo-SecureString $env:RUNNER_PASSWORD -AsPlainText -Force
#	$credentials = New-Object PSCredential $env:RUNNER_USER,$password
#
#	Write-Host "logging in ..."
#	/zap-scanner/Invoke-ZAPScan.ps1 -url $BaseUrl -ruleSet Generic -phase start -username $credentials -realm "LEGO"
#	Write-Host "logged in"
#
#	 Write-Host 'Sending requests'
#	$proxy = New-Object System.Net.WebProxy
#	$proxy.Address = "$zapProxy"
#
#
#
#	$url_unpublish = "$BaseUrl/unpublish"
#	Write-Host 'Sending unpublish request'
#	#unpublish item endpoint
#	$web = New-Object Net.WebClient
#	$web.Headers.Add("Content-Type", "application/json");
#	$web.Proxy = $proxy;
#	$psObject = @{
#		"Ids"=@("2E35508A-3B3F-47CA-8F1B-2862B63E2F63");
#		"CultureInfo"="en-US";
#		"Database"="pub";
#		"SlingshotAlias"="Article";
#		"CorrelationId"="7DF25B61-5952-4034-92AB-A81A186174CF";
#	}
#	$jsonString = ($psObject | ConvertTo-Json -Depth 100 -Compress)
#	Write-Host "Upload string"
#	Write-Host $url_unpublish
#	Write-Host $jsonString
#	$web.UploadString($url_unpublish, $jsonString);

#	SendWebRequest -proxy $proxy -url "$BaseUrl/item?id=2E35508A-3B3F-47CA-8F1B-2862B63E2F63&cultureInfo=en-US&database=pub"
#	SendWebRequest -proxy $proxy -url "$BaseUrl/publish?id=2E35508A-3B3F-47CA-8F1B-2862B63E2F63&database=pub"
#
#
#
#	Write-Host 'Scaning'
#	/zap-scanner/Invoke-ZAPScan.ps1 -url $BaseUrl -ruleset generic -phase active -daemon
#
#
#
#	#Generate Result Reports
#	$result = /zap-scanner/Invoke-ZAPScan.ps1 -url "$BaseUrl" -ruleSet Generic -phase report -outputFolder (Join-Path $env:CI_PROJECT_DIR output)
#	if($result.HighestTLGSeverityLevel -gt 5) {
#		Write-Host "Medium or higher zap alert present" -ForegroundColor:Red
#	} Else {
#		Write-Host "No errors found while scanning with ZAP. Continuing with the pipeline" -ForegroundColor:Green
#		Write-Host "`n"
#	}
#
#} catch {
#	Write-Host "'n"
#	throw
#}