<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteCollectionEntity>
   <description></description>
   <name>BuzzCollection</name>
   <tag>Buzz</tag>
   <delayBetweenInstances>0</delayBetweenInstances>
   <executionMode>SEQUENTIAL</executionMode>
   <maxConcurrentInstances>8</maxConcurrentInstances>
   <testSuiteRunConfigurations>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Web Desktop</groupName>
            <profileName>default</profileName>
            <requireConfigurationData>false</requireConfigurationData>
            <runConfigurationId>Chrome</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity>Test Suites/BuzzModule</testSuiteEntity>
      </TestSuiteRunConfiguration>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Web Desktop</groupName>
            <profileName>default</profileName>
            <requireConfigurationData>true</requireConfigurationData>
            <runConfigurationData>
               <entry>
                  <key>testCloudDesktopBrowser</key>
                  <value>{
  &quot;id&quot;: 397,
  &quot;osDisplayName&quot;: &quot;Windows&quot;,
  &quot;browserName&quot;: &quot;msedge&quot;,
  &quot;browserDisplayName&quot;: &quot;Edge Chromium&quot;,
  &quot;browserVersion&quot;: &quot;127&quot;,
  &quot;os&quot;: &quot;windows&quot;,
  &quot;platformName&quot;: &quot;IOS&quot;,
  &quot;timeout&quot;: 15,
  &quot;usingTunnel&quot;: false
}</value>
               </entry>
               <entry>
                  <key>testCloudSessionType</key>
                  <value>DESKTOP_BROWSER</value>
               </entry>
            </runConfigurationData>
            <runConfigurationId>TestCloud</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity>Test Suites/LoginVerifications</testSuiteEntity>
      </TestSuiteRunConfiguration>
   </testSuiteRunConfigurations>
</TestSuiteCollectionEntity>
