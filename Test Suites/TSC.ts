<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteCollectionEntity>
   <description></description>
   <name>TSC</name>
   <tag></tag>
   <delayBetweenInstances>0</delayBetweenInstances>
   <executionMode>SEQUENTIAL</executionMode>
   <maxConcurrentInstances>8</maxConcurrentInstances>
   <testSuiteRunConfigurations>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Web Desktop</groupName>
            <profileName>default</profileName>
            <requireConfigurationData>true</requireConfigurationData>
            <runConfigurationId>TestCloud</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity>Test Suites/BhavyanshADOts</testSuiteEntity>
      </TestSuiteRunConfiguration>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Web Desktop</groupName>
            <profileName>default</profileName>
            <requireConfigurationData>true</requireConfigurationData>
            <runConfigurationData>
               <entry>
                  <key>testCloudMobileDevice</key>
                  <value>{
  &quot;capability&quot;: {
    &quot;availability&quot;: &quot;HIGH&quot;
  },
  &quot;id&quot;: &quot;any_android_phone&quot;,
  &quot;isTablet&quot;: false,
  &quot;mobileDeviceId&quot;: &quot;any_android_phone_15&quot;,
  &quot;name&quot;: &quot;Any Phone&quot;,
  &quot;displayName&quot;: &quot;Any Phone&quot;,
  &quot;osVersion&quot;: &quot;15&quot;,
  &quot;os&quot;: &quot;Android&quot;,
  &quot;platformName&quot;: &quot;ANDROID&quot;,
  &quot;timeout&quot;: 15,
  &quot;usingTunnel&quot;: false,
  &quot;isHighAvailableDevice&quot;: true
}</value>
               </entry>
               <entry>
                  <key>testCloudSessionType</key>
                  <value>MOBILE_NATIVE</value>
               </entry>
               <entry>
                  <key>testCloudOverrideMobileApplication</key>
                  <value>{&quot;id&quot;:&quot;3c3114e5-e19d-4e4e-9971-7c895cc0c37d&quot;,&quot;organizationId&quot;:&quot;1959366&quot;,&quot;name&quot;:&quot;flutter_webview_sample_app&quot;,&quot;platform&quot;:&quot;ANDROID&quot;,&quot;status&quot;:&quot;READY&quot;,&quot;size&quot;:20701123,&quot;storagePath&quot;:&quot;49fb0c39-bfcd-4ba1-9972-070f2f8b6c43&quot;,&quot;uploadedDate&quot;:&quot;2025-02-16T08:14:35.334919&quot;,&quot;createdDate&quot;:&quot;2025-02-16T08:14:35.334919&quot;,&quot;updatedDate&quot;:&quot;2025-02-16T08:14:41.341244&quot;,&quot;fileName&quot;:&quot;app-release.apk&quot;,&quot;metadata&quot;:{&quot;identifier&quot;:&quot;com.example.flutter_webview_sample_app&quot;,&quot;name&quot;:&quot;flutter_webview_sample_app&quot;,&quot;version&quot;:&quot;0.1.0&quot;}}</value>
               </entry>
            </runConfigurationData>
            <runConfigurationId>TestCloud</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity>Test Suites/BhavyanshADOts</testSuiteEntity>
      </TestSuiteRunConfiguration>
   </testSuiteRunConfigurations>
</TestSuiteCollectionEntity>
