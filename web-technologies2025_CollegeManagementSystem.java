<!DOCTYPE html>
<!-- saved from url=(0096)https://github.com/AmirishettyAkhila/web-technologies2025/blob/main/CollegeManagementSystem.java -->
<html lang="en" data-color-mode="auto" data-light-theme="light" data-dark-theme="dark" data-a11y-animated-images="system" data-a11y-link-underlines="true" data-turbo-loaded=""><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8"><style type="text/css">.turbo-progress-bar {
  position: fixed;
  display: block;
  top: 0;
  left: 0;
  height: 3px;
  background: #0076ff;
  z-index: 2147483647;
  transition:
    width 300ms ease-out,
    opacity 150ms 150ms ease-in;
  transform: translate3d(0, 0, 0);
}
</style>
    
  
  
  
  
  
  

  

  <link crossorigin="anonymous" media="all" rel="stylesheet" href="./web-technologies2025_CollegeManagementSystem_files/light-7aa84bb7e11e.css"><link crossorigin="anonymous" media="all" rel="stylesheet" href="./web-technologies2025_CollegeManagementSystem_files/dark-f65db3e8d171.css"><link data-color-theme="dark_dimmed" crossorigin="anonymous" media="all" rel="stylesheet" data-href="https://github.githubassets.com/assets/dark_dimmed-a8258e3c6dda.css"><link data-color-theme="dark_high_contrast" crossorigin="anonymous" media="all" rel="stylesheet" data-href="https://github.githubassets.com/assets/dark_high_contrast-7e97d834719c.css"><link data-color-theme="dark_colorblind" crossorigin="anonymous" media="all" rel="stylesheet" data-href="https://github.githubassets.com/assets/dark_colorblind-01d869f460be.css"><link data-color-theme="light_colorblind" crossorigin="anonymous" media="all" rel="stylesheet" data-href="https://github.githubassets.com/assets/light_colorblind-534f3e971240.css"><link data-color-theme="light_high_contrast" crossorigin="anonymous" media="all" rel="stylesheet" data-href="https://github.githubassets.com/assets/light_high_contrast-a8cc7d138001.css"><link data-color-theme="light_tritanopia" crossorigin="anonymous" media="all" rel="stylesheet" data-href="https://github.githubassets.com/assets/light_tritanopia-35e9dfdc4f9f.css"><link data-color-theme="dark_tritanopia" crossorigin="anonymous" media="all" rel="stylesheet" data-href="https://github.githubassets.com/assets/dark_tritanopia-cf4cc5f62dfe.css">

    <link crossorigin="anonymous" media="all" rel="stylesheet" href="./web-technologies2025_CollegeManagementSystem_files/primer-primitives-d9abecd14f1e.css">
    <link crossorigin="anonymous" media="all" rel="stylesheet" href="./web-technologies2025_CollegeManagementSystem_files/primer-93aded0ee8a1.css">
    <link crossorigin="anonymous" media="all" rel="stylesheet" href="./web-technologies2025_CollegeManagementSystem_files/global-8bed0685a4b5.css">
    <link crossorigin="anonymous" media="all" rel="stylesheet" href="./web-technologies2025_CollegeManagementSystem_files/github-15d4b28ab680.css">
  <link crossorigin="anonymous" media="all" rel="stylesheet" href="./web-technologies2025_CollegeManagementSystem_files/repository-4fce88777fa8.css">
<link crossorigin="anonymous" media="all" rel="stylesheet" href="./web-technologies2025_CollegeManagementSystem_files/code-0210be90f4d3.css">

  


  <script type="application/json" id="client-env">{"locale":"en","featureFlags":["a11y_quote_reply_fix","allow_subscription_halted_error","copilot_immersive_file_preview","copilot_new_references_ui","copilot_attach_folder_reference","copilot_personal_instructions","copilot_personal_instructions_templates","copilot_chat_repo_custom_instructions_preview","copilot_chat_retry_on_error","copilot_chat_opening_thread_switch","copilot_chat_persist_submitted_input","copilot_conversational_ux_history_refs","copilot_chat_shared_chat_input","copilot_chat_thread_name_max_length","copilot_editor_upsells","copilot_implicit_context","copilot_no_floating_button","copilot_smell_icebreaker_ux","copilot_read_shared_conversation","dotcom_chat_client_side_skills","experimentation_azure_variant_endpoint","failbot_handle_non_errors","geojson_azure_maps","ghost_pilot_confidence_truncation_25","ghost_pilot_confidence_truncation_40","github_models_gateway","github_models_o3_mini_streaming","hide_billing_usage_filters","hovercard_accessibility","insert_before_patch","issues_advanced_search","issues_react_remove_placeholders","issues_react_blur_item_picker_on_close","issues_react_include_bots_in_pickers","marketing_pages_search_explore_provider","remove_child_patch","repository_suggester_elastic_search","sample_network_conn_type","swp_enterprise_contact_form","site_copilot_extensions_ga","site_copilot_vscode_link_update","site_proxima_australia_update","issues_react_create_milestone","issues_react_cache_fix_workaround","lifecycle_label_name_updates","item_picker_new_select_panel","issues_react_assignee_warning"],"login":"Lisha-Sinha"}</script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/wp-runtime-57bbf3b9b7f3.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_oddbird_popover-polyfill_dist_popover_js-9da652f58479.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_github_arianotify-polyfill_ariaNotify-polyfill_js-node_modules_github_mi-3abb8f-d7e6bc799724.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/ui_packages_failbot_failbot_ts-4600dbf2d60a.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/environment-f04cb2a9fc8c.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_primer_behaviors_dist_esm_index_mjs-0dbb79f97f8f.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_github_selector-observer_dist_index_esm_js-f690fd9ae3d5.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_github_relative-time-element_dist_index_js-f6da4b3fa34c.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_github_auto-complete-element_dist_index_js-node_modules_github_catalyst_-8e9f78-a74b4e0a8a6b.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_github_text-expander-element_dist_index_js-78748950cb0c.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_github_filter-input-element_dist_index_js-node_modules_github_remote-inp-b5f1d7-a1760ffda83d.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_github_markdown-toolbar-element_dist_index_js-ceef33f593fa.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_github_file-attachment-element_dist_index_js-node_modules_primer_view-co-c44a69-8094ee2ecc5e.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/github-elements-c5fd390b3ba0.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/element-registry-b91e8c7aa0b9.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_braintree_browser-detection_dist_browser-detection_js-node_modules_githu-bb80ec-72267f4e3ff9.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_lit-html_lit-html_js-be8cb88f481b.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_github_mini-throttle_dist_index_js-node_modules_morphdom_dist_morphdom-e-7c534c-a4a1922eb55f.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_github_turbo_dist_turbo_es2017-esm_js-e3cbe28f1638.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_github_remote-form_dist_index_js-node_modules_delegated-events_dist_inde-893f9f-6cf3320416b8.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_color-convert_index_js-e3180fe3bcb3.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_github_quote-selection_dist_index_js-node_modules_github_session-resume_-69cfcc-bc42a18e77d5.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/ui_packages_updatable-content_updatable-content_ts-a1563f62660e.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/app_assets_modules_github_behaviors_task-list_ts-app_assets_modules_github_sso_ts-ui_packages-900dde-035d0557f18e.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/app_assets_modules_github_sticky-scroll-into-view_ts-3e000c5d31a9.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/app_assets_modules_github_behaviors_ajax-error_ts-app_assets_modules_github_behaviors_include-87a4ae-97019968d380.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/app_assets_modules_github_behaviors_commenting_edit_ts-app_assets_modules_github_behaviors_ht-83c235-e429cff6ceb1.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/behaviors-8ac983183615.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_delegated-events_dist_index_js-node_modules_github_catalyst_lib_index_js-f6223d90c7ba.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/notifications-global-01e85cd1be94.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_virtualized-list_es_index_js-node_modules_github_template-parts_lib_index_js-94dc7a2157c1.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_github_remote-form_dist_index_js-node_modules_delegated-events_dist_inde-70450e-eecf0d50276f.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/app_assets_modules_github_ref-selector_ts-3e9d848bab5f.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/codespaces-7459d4a230c1.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_github_filter-input-element_dist_index_js-node_modules_github_remote-inp-3eebbd-0763620ad7bf.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_github_mini-throttle_dist_decorators_js-node_modules_delegated-events_di-e161aa-9d41fb1b6c9e.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_github_file-attachment-element_dist_index_js-node_modules_github_remote--3c9c82-7238cfcdaa51.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/repositories-7a0dbaa42c57.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_github_mini-throttle_dist_index_js-node_modules_github_catalyst_lib_inde-dbbea9-26cce2010167.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/code-menu-1c0aedc134b1.js.download"></script>
  
  <link crossorigin="anonymous" media="all" rel="stylesheet" href="./web-technologies2025_CollegeManagementSystem_files/primer-react.2b41f48ec06f29182cb4.module.css">
<link crossorigin="anonymous" media="all" rel="stylesheet" href="./web-technologies2025_CollegeManagementSystem_files/notifications-subscriptions-menu.1bcff9205c241e99cff2.module.css">


  



  
  
  

    
  


  


    


  
  

  
  

    



  

  




    

  

    

    

      

      

    
    
    

      
  
  


      
      


      


      
      
      

        


  <meta http-equiv="x-pjax-version" content="ee083d5208661d2266e1f47324492d28eddfa7a115e0d3e5120642d72d6c1c35" data-turbo-track="reload">
  <meta http-equiv="x-pjax-csp-version" content="ace39c3b6632770952207593607e6e0be0db363435a8b877b1f96abe6430f345" data-turbo-track="reload">
  <meta http-equiv="x-pjax-css-version" content="249d206a8cd18f10036cb45c470746438fc2c46dae40dbaa0f80bb8c4539b047" data-turbo-track="reload">
  <meta http-equiv="x-pjax-js-version" content="136e528065510a940a51e3d593bfe3068968d5f2527eb130a9e4bcbcb924b5a3" data-turbo-track="reload">

  

      
  

  



      


    


  

  

  
  
  




  
  

  

  <style data-styled="active" data-styled-version="5.3.11"></style><style id="ms-consent-banner-main-styles">.w8hcgFksdo30C8w-bygqu{color:#000}.ydkKdaztSS0AeHWIeIHsQ a{color:#0067B8}.erL690_8JwUW-R4bJRcfl{background-color:#EBEBEB;border:none;color:#000}.erL690_8JwUW-R4bJRcfl:enabled:hover{color:#000;background-color:#DBDBDB;box-shadow:0px 4px 10px rgba(0,0,0,0.25);border:none}.erL690_8JwUW-R4bJRcfl:enabled:focus{background-color:#DBDBDB;box-shadow:0px 4px 10px rgba(0,0,0,0.25);border:2px solid #000}.erL690_8JwUW-R4bJRcfl:disabled{opacity:1;color:rgba(0,0,0,0.2);background-color:rgba(0,0,0,0.2);border:none}._1zNQOqxpBFSokeCLGi_hGr{border:none;background-color:#0067B8;color:#fff}._1zNQOqxpBFSokeCLGi_hGr:enabled:hover{color:#fff;background-color:#0067B8;box-shadow:0px 4px 10px rgba(0,0,0,0.25);border:none}._1zNQOqxpBFSokeCLGi_hGr:enabled:focus{background-color:#0067B8;box-shadow:0px 4px 10px rgba(0,0,0,0.25);border:2px solid #000}._1zNQOqxpBFSokeCLGi_hGr:disabled{opacity:1;color:rgba(0,0,0,0.2);background-color:rgba(0,120,215,0.2);border:none}._23tra1HsiiP6cT-Cka-ycB{position:relative;display:flex;z-index:9999;width:100%;background-color:#F2F2F2;justify-content:space-between;text-align:left}div[dir="rtl"]._23tra1HsiiP6cT-Cka-ycB{text-align:right}._1Upc2NjY8AlDn177YoVj0y{margin:0;padding-left:5%;padding-top:8px;padding-bottom:8px}div[dir="rtl"] ._1Upc2NjY8AlDn177YoVj0y{margin:0;padding:8px 5% 8px 0;float:none}._23tra1HsiiP6cT-Cka-ycB svg{fill:none;max-width:none;max-height:none}._1V_hlU-7jdtPiooHMu89BB{display:table-cell;padding:12px;width:24px;height:24px;font-family:Segoe UI, SegoeUI, Arial, sans-serif;font-style:normal;font-weight:normal;font-size:24px;line-height:0}.f6QKJD7fhSbnJLarTL-W-{display:table-cell;vertical-align:middle;padding:0;font-family:Segoe UI, SegoeUI, Arial, sans-serif;font-style:normal;font-weight:normal;font-size:13px;line-height:16px}.f6QKJD7fhSbnJLarTL-W- a{text-decoration:underline}._2j0fmugLb1FgYz6KPuB91w{display:inline-block;margin-left:5%;margin-right:5%;min-width:40%;min-width:calc((150px + 3 * 4px) * 2 + 150px);min-width:-webkit-fit-content;min-width:-moz-fit-content;min-width:fit-content;align-self:center;position:relative}._1XuCi2WhiqeWRUVp3pnFG3{margin:4px;padding:5px;min-width:150px;min-height:36px;vertical-align:top;cursor:pointer;font-family:Segoe UI, SegoeUI, Arial, sans-serif;font-style:normal;font-weight:normal;font-size:15px;line-height:20px;text-align:center}._1XuCi2WhiqeWRUVp3pnFG3:focus{box-sizing:border-box}._1XuCi2WhiqeWRUVp3pnFG3:disabled{cursor:not-allowed}._2bvsb3ubApyZ0UGoQA9O9T{display:block;position:fixed;z-index:10000;top:0;left:0;width:100%;height:100%;background-color:rgba(255,255,255,0.6);overflow:auto;text-align:left}div[dir="rtl"]._2bvsb3ubApyZ0UGoQA9O9T{text-align:right}div[dir="rtl"] ._2bvsb3ubApyZ0UGoQA9O9T{left:auto;right:0}.AFsJE948muYyzCMktdzuk{position:relative;top:8%;margin-bottom:40px;margin-left:auto;margin-right:auto;box-sizing:border-box;width:640px;background-color:#fff;border:1px solid #0067B8}._3kWyBRbW_dgnMiEyx06Fu4{float:right;z-index:1;margin:2px;padding:12px;border:none;cursor:pointer;font-family:Segoe UI, SegoeUI, Arial, sans-serif;font-style:normal;font-weight:normal;font-size:13px;line-height:13px;display:flex;align-items:center;text-align:center;color:#666;background-color:#fff}div[dir="rtl"] ._3kWyBRbW_dgnMiEyx06Fu4{margin:2px;padding:12px;float:left}.uCYvKvHXrhjNgflv1VqdD{position:static;margin-top:36px;margin-left:36px;margin-right:36px}._17pX1m9O_W--iZbDt3Ta5r{margin-top:0;margin-bottom:12px;font-family:Segoe UI, SegoeUI, Arial, sans-serif;font-style:normal;font-weight:600;font-size:20px;line-height:24px;text-transform:none}._1kBkHQ1V1wu3kl-YcLgUr6{height:446px;overflow:auto}._20_nXDf6uFs9Q6wxRXG-I-{margin-top:0;font-family:Segoe UI, SegoeUI, Arial, sans-serif;font-style:normal;font-weight:normal;font-size:15px;line-height:20px}._20_nXDf6uFs9Q6wxRXG-I- a{text-decoration:underline}dl._2a0NH_GDQEQe5Ynfo7suVH{margin-top:36px;margin-bottom:0;padding:0;list-style:none;text-transform:none}dt._3j_LCPv7fyXv3A8FIXVwZ4{margin-top:20px;float:none;font-family:Segoe UI, SegoeUI, Arial, sans-serif;font-style:normal;font-weight:600;font-size:18px;line-height:24px;list-style:none}.k-vxTGFbdq1aOZB2HHpjh{margin:0;padding:0;border:none}._2Bucyy75c_ogoU1g-liB5R{margin:0;padding:0;border-bottom:none;font-family:Segoe UI, SegoeUI, Arial, sans-serif;font-style:normal;font-weight:600;font-size:18px;line-height:24px;text-transform:none}._63gwfzV8dclrsl2cfd90r{display:inline-block;margin-top:0;margin-bottom:13px;font-family:Segoe UI, SegoeUI, Arial, sans-serif;font-style:normal;font-weight:normal;font-size:15px;line-height:20px}._1l8wM_4mRYGz3Iu7l3BZR7{display:block}._2UE03QS02aZGkslegN_F-i{display:inline-block;position:relative;left:5px;margin-bottom:13px;margin-right:34px;padding:3px}div[dir="rtl"] ._2UE03QS02aZGkslegN_F-i{margin:0 0 13px 34px;padding:3px;float:none}div[dir="rtl"] ._2UE03QS02aZGkslegN_F-i{left:auto;right:5px}._23tra1HsiiP6cT-Cka-ycB *::before,._2bvsb3ubApyZ0UGoQA9O9T *::before,._23tra1HsiiP6cT-Cka-ycB *::after,._2bvsb3ubApyZ0UGoQA9O9T *::after{box-sizing:inherit}._1HSFn0HzGo6w4ADApV8-c4{outline:2px solid rgba(0,0,0,0.8)}input[type="radio"]._1dp8Vp5m3HwAqGx8qBmFV2{display:inline-block;position:relative;margin-top:0;margin-left:0;margin-right:0;height:0;width:0;border-radius:0;cursor:pointer;outline:none;box-sizing:border-box;-webkit-appearance:none;-moz-appearance:none;appearance:none}input[type="radio"]._1dp8Vp5m3HwAqGx8qBmFV2+label::before{display:block;position:absolute;top:5px;left:3px;height:19px;width:19px;content:"";border-radius:50%;border:1px solid #000;background-color:#fff}div[dir="rtl"] input[type="radio"]._1dp8Vp5m3HwAqGx8qBmFV2+label::before{left:auto;right:3px}input[type="radio"]._1dp8Vp5m3HwAqGx8qBmFV2:not(:disabled)+label:hover::before{border:1px solid #0067B8}input[type="radio"]._1dp8Vp5m3HwAqGx8qBmFV2:not(:disabled)+label:hover::after{display:block;position:absolute;top:10px;left:8px;height:9px;width:9px;content:"";border-radius:50%;background-color:rgba(0,0,0,0.8)}div[dir="rtl"] input[type="radio"]._1dp8Vp5m3HwAqGx8qBmFV2:not(:disabled)+label:hover::after{left:auto;right:8px}input[type="radio"]._1dp8Vp5m3HwAqGx8qBmFV2:not(:disabled)+label:focus::before{border:1px solid #0067B8}input[type="radio"]._1dp8Vp5m3HwAqGx8qBmFV2:not(:disabled)+label:focus::after{display:block;position:absolute;top:10px;left:8px;height:9px;width:9px;content:"";border-radius:50%;background-color:#000}div[dir="rtl"] input[type="radio"]._1dp8Vp5m3HwAqGx8qBmFV2:not(:disabled)+label:focus::after{left:auto;right:8px}input[type="radio"]._1dp8Vp5m3HwAqGx8qBmFV2:checked+label::after{display:block;position:absolute;top:10px;left:8px;height:9px;width:9px;content:"";border-radius:50%;background-color:#000}div[dir="rtl"] input[type="radio"]._1dp8Vp5m3HwAqGx8qBmFV2:checked+label::after{left:auto;right:8px}input[type="radio"]._1dp8Vp5m3HwAqGx8qBmFV2:disabled+label{cursor:not-allowed}input[type="radio"]._1dp8Vp5m3HwAqGx8qBmFV2:disabled+label::before{border:1px solid rgba(0,0,0,0.2);background-color:rgba(0,0,0,0.2)}._3RJzeL3l9Rl_lAQEm6VwdX{display:block;position:static;float:right;margin-top:0;margin-bottom:0;margin-left:19px;margin-right:0;padding-top:0;padding-bottom:0;padding-left:8px;padding-right:0;width:80%;width:calc(100% - 19px);font-family:Segoe UI, SegoeUI, Arial, sans-serif;font-style:normal;font-weight:normal;font-size:15px;line-height:20px;text-transform:none;cursor:pointer;box-sizing:border-box}div[dir="rtl"] ._3RJzeL3l9Rl_lAQEm6VwdX{margin:0 19px 0 0;padding:0 8px 0 0;float:left}.nohp3sIG12ZBhzcMnPala{margin-top:20px;margin-bottom:48px}._2uhaEsmeotZ3P-M0AXo2kF{padding:0;width:278px;height:36px;cursor:pointer;font-family:Segoe UI, SegoeUI, Arial, sans-serif;font-style:normal;font-weight:normal;font-size:15px;line-height:20px;text-align:center}._2uhaEsmeotZ3P-M0AXo2kF:focus{box-sizing:border-box}._2uhaEsmeotZ3P-M0AXo2kF:disabled{cursor:not-allowed}._3tOu1FJ59c_xz_PmI1lKV5{float:right;padding:0;width:278px;height:36px;cursor:pointer;font-family:Segoe UI, SegoeUI, Arial, sans-serif;font-style:normal;font-weight:normal;font-size:15px;line-height:20px;text-align:center}._3tOu1FJ59c_xz_PmI1lKV5:focus{box-sizing:border-box}._3tOu1FJ59c_xz_PmI1lKV5:disabled{cursor:not-allowed}div[dir="rtl"] ._3tOu1FJ59c_xz_PmI1lKV5{margin:0;padding:0;float:left}@media only screen and (max-width: 768px){._2j0fmugLb1FgYz6KPuB91w,._1Upc2NjY8AlDn177YoVj0y{padding-top:8px;padding-bottom:12px;padding-left:3.75%;padding-right:3.75%;margin:0;width:92.5%}._23tra1HsiiP6cT-Cka-ycB{display:block}._1XuCi2WhiqeWRUVp3pnFG3{margin-bottom:8px;margin-left:0;margin-right:0;width:100%}._2bvsb3ubApyZ0UGoQA9O9T{overflow:hidden}.AFsJE948muYyzCMktdzuk{top:1.8%;width:93.33%;height:96.4%;overflow:hidden}.uCYvKvHXrhjNgflv1VqdD{margin-top:24px;margin-left:24px;margin-right:24px;height:100%}._1kBkHQ1V1wu3kl-YcLgUr6{height:62%;height:calc(100% - 188px);min-height:50%}._2uhaEsmeotZ3P-M0AXo2kF{width:100%}._3tOu1FJ59c_xz_PmI1lKV5{margin-bottom:12px;margin-left:0;width:100%}div[dir="rtl"] ._3tOu1FJ59c_xz_PmI1lKV5{margin:0 0 12px 0;padding:0;float:none}}@media only screen and (max-width: 768px) and (orientation: landscape), only screen and (max-height: 260px), only screen and (max-width: 340px){.AFsJE948muYyzCMktdzuk{overflow:auto}}@media only screen and (max-height: 260px), only screen and (max-width: 340px){._1XuCi2WhiqeWRUVp3pnFG3{min-width:0}._3kWyBRbW_dgnMiEyx06Fu4{padding:3%}.uCYvKvHXrhjNgflv1VqdD{margin-top:3%;margin-left:3%;margin-right:3%}._17pX1m9O_W--iZbDt3Ta5r{margin-bottom:3%}._1kBkHQ1V1wu3kl-YcLgUr6{height:calc(79% - 64px)}.nohp3sIG12ZBhzcMnPala{margin-top:5%;margin-bottom:10%}._3tOu1FJ59c_xz_PmI1lKV5{margin-bottom:3%}div[dir="rtl"] ._3tOu1FJ59c_xz_PmI1lKV5{margin:0 0 3% 0;padding:0;float:none}}
</style><style type="text/css" id="ms-consent-banner-theme-styles">._23tra1HsiiP6cT-Cka-ycB {
            background-color: #24292f !important;
        }.w8hcgFksdo30C8w-bygqu {
            color: #ffffff !important;
        }.ydkKdaztSS0AeHWIeIHsQ a {
            color: #d8b9ff !important;
        }._2bvsb3ubApyZ0UGoQA9O9T {
            background-color: rgba(23, 23, 23, 0.8) !important;
        }.AFsJE948muYyzCMktdzuk {
            background-color: #24292f !important;
            border: 1px solid #d8b9ff !important;
        }._3kWyBRbW_dgnMiEyx06Fu4 {
            color: #d8b9ff !important;
            background-color: #24292f !important;
        }._1zNQOqxpBFSokeCLGi_hGr {
            border: 1px solid #ffffff !important;
            background-color: #ffffff !important;
            color: #1f2328 !important;
        }._1zNQOqxpBFSokeCLGi_hGr:enabled:hover {
            color: #1f2328 !important;
            background-color: #d8b9ff !important;
            box-shadow: none !important;
            border: 1px solid transparent !important;
        }._1zNQOqxpBFSokeCLGi_hGr:enabled:focus {
            background-color: #d8b9ff !important;
            box-shadow: none !important;
            border: 2px solid #ffffff !important;
        }._1zNQOqxpBFSokeCLGi_hGr:disabled {
            opacity: 0.5 !important;
            color: #1f2328 !important;
            background-color: #ffffff !important;
            border: 1px solid transparent !important;
        }.erL690_8JwUW-R4bJRcfl {
            border: 1px solid #eaeef2 !important;
            background-color: #32383f !important;
            color: #ffffff !important;
        }.erL690_8JwUW-R4bJRcfl:enabled:hover {
            color: #ffffff !important;
            background-color: #24292f !important;
            box-shadow: none !important;
            border: 1px solid #ffffff !important;
        }.erL690_8JwUW-R4bJRcfl:enabled:focus {
            background-color: #24292f !important;
            box-shadow: none !important;
            border: 2px solid #6e7781 !important;
        }.erL690_8JwUW-R4bJRcfl:disabled {
            opacity: 0.5 !important;
            color: #ffffff !important;
            background-color: #424a53 !important;
            border: 1px solid #6e7781 !important;
        }input[type="radio"]._1dp8Vp5m3HwAqGx8qBmFV2 + label::before {
            border: 1px solid #d8b9ff !important;
            background-color: #24292f !important;
        }._1HSFn0HzGo6w4ADApV8-c4 {
            outline: 2px solid #ffffff !important;
        }input[type="radio"]._1dp8Vp5m3HwAqGx8qBmFV2:checked + label::after {
            background-color: #d8b9ff !important;
        }input[type="radio"]._1dp8Vp5m3HwAqGx8qBmFV2 + label:hover::before {
            border: 1px solid #ffffff !important;
        }input[type="radio"]._1dp8Vp5m3HwAqGx8qBmFV2 + label:hover::after {
            background-color: #ffffff !important;
        }input[type="radio"]._1dp8Vp5m3HwAqGx8qBmFV2 + label:focus::before {
            border: 1px solid #ffffff !important;
        }input[type="radio"]._1dp8Vp5m3HwAqGx8qBmFV2 + label:focus::after {
            background-color: #d8b9ff !important;
        }input[type="radio"]._1dp8Vp5m3HwAqGx8qBmFV2:disabled + label::before {
            border: 1px solid rgba(227, 227, 227, 0.2) !important;
            background-color: rgba(227, 227, 227, 0.2) !important;
        }</style><link crossorigin="anonymous" media="all" rel="stylesheet" href="./web-technologies2025_CollegeManagementSystem_files/react-code-view.ab7d8fac328c00e5e0cc.module.css"><script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/primer-react-9a5713772ca5.js.download"></script><script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/react-core-af33445b6fc3.js.download"></script><script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/react-lib-f1bca44e0926.js.download"></script><script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/octicons-react-611691cca2f6.js.download"></script><script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_emotion_is-prop-valid_dist_emotion-is-prop-valid_esm_js-node_modules_emo-62da9f-2df2f32ec596.js.download"></script><script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_github_mini-throttle_dist_index_js-node_modules_stacktrace-parser_dist_s-e7dcdd-f7cc96ebae76.js.download"></script><script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_oddbird_popover-polyfill_dist_popover-fn_js-55fea94174bf.js.download"></script><script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_dompurify_dist_purify_js-b89b98661809.js.download"></script><script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_lodash-es__Stack_js-node_modules_lodash-es__Uint8Array_js-node_modules_l-4faaa6-4a736fde5c2f.js.download"></script><script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_lodash-es__baseIsEqual_js-8929eb9718d5.js.download"></script><script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_github_hydro-analytics-client_dist_analytics-client_js-node_modules_gith-40531a-09af0ef9a562.js.download"></script><script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/ui_packages_aria-live_aria-live_ts-ui_packages_promise-with-resolvers-polyfill_promise-with-r-17c672-d6b5ea82572a.js.download"></script><script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/ui_packages_paths_index_ts-3a2d94328e87.js.download"></script><script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/ui_packages_ref-selector_RefSelector_tsx-7496afc3784d.js.download"></script><script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/ui_packages_diffs_diff-parts_ts-555a13945c12.js.download"></script><script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/ui_packages_code-view-shared_worker-jobs_debounced-worker-manager_ts-ui_packages_commit-attri-a6ddb4-3f32a388ac04.js.download"></script><script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/ui_packages_code-view-shared_hooks_use-canonical-object_ts-ui_packages_code-view-shared_hooks-a6859a-51fe787d3cdc.js.download"></script><script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/ui_packages_repos-file-tree-view_repos-file-tree-view_ts-ui_packages_feature-request_FeatureR-648c3b-ad58d952149e.js.download"></script><script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/app_assets_modules_github_blob-anchor_ts-ui_packages_code-nav_code-nav_ts-ui_packages_filter--8253c1-91468a3354f9.js.download"></script><script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/react-code-view-56d3e189774d.js.download"></script><style type="text/css" id="ms-consent-banner-theme-styles"></style><script type="application/json" id="client-env">{"locale":"en","featureFlags":["a11y_quote_reply_fix","allow_subscription_halted_error","copilot_immersive_file_preview","copilot_new_references_ui","copilot_attach_folder_reference","copilot_personal_instructions","copilot_personal_instructions_templates","copilot_chat_repo_custom_instructions_preview","copilot_chat_retry_on_error","copilot_chat_opening_thread_switch","copilot_chat_persist_submitted_input","copilot_conversational_ux_history_refs","copilot_chat_shared_chat_input","copilot_chat_thread_name_max_length","copilot_editor_upsells","copilot_implicit_context","copilot_no_floating_button","copilot_smell_icebreaker_ux","copilot_read_shared_conversation","dotcom_chat_client_side_skills","experimentation_azure_variant_endpoint","failbot_handle_non_errors","geojson_azure_maps","ghost_pilot_confidence_truncation_25","ghost_pilot_confidence_truncation_40","github_models_gateway","github_models_o3_mini_streaming","hide_billing_usage_filters","hovercard_accessibility","insert_before_patch","issues_advanced_search","issues_react_remove_placeholders","issues_react_blur_item_picker_on_close","issues_react_include_bots_in_pickers","marketing_pages_search_explore_provider","remove_child_patch","report_hydro_web_vitals","repository_suggester_elastic_search","sample_network_conn_type","swp_enterprise_contact_form","site_copilot_extensions_ga","site_copilot_vscode_link_update","site_proxima_australia_update","issues_react_create_milestone","issues_react_cache_fix_workaround","lifecycle_label_name_updates","item_picker_new_select_panel","issues_react_assignee_warning"],"login":"Lisha-Sinha"}</script><link rel="dns-prefetch" href="https://github.githubassets.com/"><link rel="dns-prefetch" href="https://avatars.githubusercontent.com/"><link rel="dns-prefetch" href="https://github-cloud.s3.amazonaws.com/"><link rel="dns-prefetch" href="https://user-images.githubusercontent.com/"><link rel="preconnect" href="https://github.githubassets.com/" crossorigin=""><link rel="preconnect" href="https://avatars.githubusercontent.com/"><title>web-technologies2025/CollegeManagementSystem.java at main · AmirishettyAkhila/web-technologies2025</title><meta name="route-pattern" content="/:user_id/:repository/blob/*name(/*path)" data-turbo-transient=""><meta name="route-controller" content="blob" data-turbo-transient=""><meta name="route-action" content="show" data-turbo-transient=""><meta name="current-catalog-service-hash" content="f3abb0cc802f3d7b95fc8762b94bdcb13bf39634c40c357301c4aa1d67a256fb"><meta name="request-id" content="EDBA:BB9A5:2516CA:2B9C86:67BDF131" data-turbo-transient="true"><meta name="html-safe-nonce" content="2fa9901ec3d9fc016ffcf2f635f0a2dfc801df226dcd872b98401bf6efc9c4c6" data-turbo-transient="true"><meta name="visitor-payload" content="eyJyZWZlcnJlciI6Imh0dHBzOi8vZ2l0aHViLmNvbS9BbWlyaXNoZXR0eUFraGlsYS93ZWItdGVjaG5vbG9naWVzMjAyNS9ibG9iL21haW4vQ29sbGVnZU1hbmFnZW1lbnRTeXN0ZW0uamF2YSIsInJlcXVlc3RfaWQiOiJFREJBOkJCOUE1OjI1MTZDQToyQjlDODY6NjdCREYxMzEiLCJ2aXNpdG9yX2lkIjoiMTE3MTYxNzM1OTkzNTczNDkwIiwicmVnaW9uX2VkZ2UiOiJjZW50cmFsaW5kaWEiLCJyZWdpb25fcmVuZGVyIjoiaWFkIn0=" data-turbo-transient="true"><meta name="visitor-hmac" content="a40f5839f276c3055a17ff2728f4801d3a6b959111a6c5c260d1859d0d997455" data-turbo-transient="true"><meta name="hovercard-subject-tag" content="repository:919401293" data-turbo-transient=""><meta name="github-keyboard-shortcuts" content="repository,source-code,file-tree,copilot" data-turbo-transient="true"><meta name="selected-link" value="repo_source" data-turbo-transient=""><link rel="assets" href="https://github.githubassets.com/"><meta name="google-site-verification" content="Apib7-x98H0j5cPqHWwSMm6dNU4GmODRoqxLiDzdx9I"><meta name="octolytics-url" content="https://collector.github.com/github/collect"><meta name="octolytics-actor-id" content="185951109"><meta name="octolytics-actor-login" content="Lisha-Sinha"><meta name="octolytics-actor-hash" content="fa4c5e4859393400a1d553a85506d1c25c0ab0975ff9d14bad0fbb31194d3757"><meta name="analytics-location" content="/&lt;user-name&gt;/&lt;repo-name&gt;/blob/show" data-turbo-transient="true"><meta name="user-login" content="Lisha-Sinha"><link rel="sudo-modal" href="https://github.com/sessions/sudo_modal"><meta name="turbo-cache-control" content="no-preview" data-turbo-transient=""><meta name="turbo-cache-control" content="no-cache" data-turbo-transient=""><meta data-hydrostats="publish"><meta name="go-import" content="github.com/AmirishettyAkhila/web-technologies2025 git https://github.com/AmirishettyAkhila/web-technologies2025.git"><meta name="octolytics-dimension-user_id" content="163986912"><meta name="octolytics-dimension-user_login" content="AmirishettyAkhila"><meta name="octolytics-dimension-repository_id" content="919401293"><meta name="octolytics-dimension-repository_nwo" content="AmirishettyAkhila/web-technologies2025"><meta name="octolytics-dimension-repository_public" content="true"><meta name="octolytics-dimension-repository_is_fork" content="false"><meta name="octolytics-dimension-repository_network_root_id" content="919401293"><meta name="octolytics-dimension-repository_network_root_nwo" content="AmirishettyAkhila/web-technologies2025"><meta name="turbo-body-classes" content="logged-in env-production page-responsive"><meta name="browser-stats-url" content="https://api.github.com/_private/browser/stats"><meta name="browser-errors-url" content="https://api.github.com/_private/browser/errors"><link rel="mask-icon" href="https://github.githubassets.com/assets/pinned-octocat-093da3e6fa40.svg" color="#000000"><link rel="alternate icon" class="js-site-favicon" type="image/png" href="https://github.githubassets.com/favicons/favicon.png"><link rel="icon" class="js-site-favicon" type="image/svg+xml" href="https://github.githubassets.com/favicons/favicon.svg" data-base-href="https://github.githubassets.com/favicons/favicon"><meta name="theme-color" content="#1e2327"><meta name="color-scheme" content="light dark"><meta name="msapplication-TileImage" content="/windows-tile.png"><meta name="msapplication-TileColor" content="#ffffff"><link rel="manifest" href="https://github.com/manifest.json" crossorigin="use-credentials"><style type="text/css" id="ms-consent-banner-theme-styles"></style></head>

  <body class="logged-in env-production page-responsive" style="overflow-wrap: break-word; --dialog-scrollgutter: 15px;">
    <div data-turbo-body="" class="logged-in env-production page-responsive" style="word-wrap: break-word;">
      


    <div class="position-relative header-wrapper js-header-wrapper ">
      <a href="https://github.com/AmirishettyAkhila/web-technologies2025/blob/main/CollegeManagementSystem.java#start-of-content" data-skip-target-assigned="false" class="p-3 color-bg-accent-emphasis color-fg-on-emphasis show-on-focus js-skip-to-content">Skip to content</a>

      <span data-view-component="true" class="progress-pjax-loader Progress position-fixed width-full">
    <span style="width: 0%;" data-view-component="true" class="Progress-item progress-pjax-loader-bar left-0 top-0 color-bg-accent-emphasis"></span>
</span>      
      
      <script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/ui_packages_ui-commands_ui-commands_ts-97496b0f52ba.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/keyboard-shortcuts-dialog-c79a97a16b04.js.download"></script>
<link crossorigin="anonymous" media="all" rel="stylesheet" href="./web-technologies2025_CollegeManagementSystem_files/primer-react.2b41f48ec06f29182cb4.module.css">

<react-partial partial-name="keyboard-shortcuts-dialog" data-ssr="false" data-attempted-ssr="false" data-catalyst="" class="loaded">
  
  <script type="application/json" data-target="react-partial.embeddedData">{"props":{"docsUrl":"https://docs.github.com/get-started/accessibility/keyboard-shortcuts"}}</script>
  <div data-target="react-partial.reactRoot"><div class="d-none"></div><script type="application/json" id="__PRIMER_DATA_:r3t:__">{"resolvedServerColorMode":"day"}</script></div>
</react-partial>




      

          

              <header class="AppHeader" role="banner">
  <h2 class="sr-only">Navigation Menu</h2>

    

    <div class="AppHeader-globalBar pb-2 js-global-bar">
      <div class="AppHeader-globalBar-start">
          <deferred-side-panel data-url="/_side-panels/global" data-catalyst="">
  <include-fragment data-target="deferred-side-panel.fragment"><template shadowrootmode="open"><style>:host {display: block;}</style><slot></slot></template>
      <button aria-label="Open global navigation menu" data-action="click:deferred-side-panel#loadPanel click:deferred-side-panel#panelOpened" data-show-dialog-id="dialog-19cb4a88-28f6-407d-a5ba-ad904c160266" id="dialog-show-dialog-19cb4a88-28f6-407d-a5ba-ad904c160266" type="button" data-view-component="true" class="Button Button--iconOnly Button--secondary Button--medium AppHeader-button p-0 color-fg-muted">  <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-three-bars Button-visual">
    <path d="M1 2.75A.75.75 0 0 1 1.75 2h12.5a.75.75 0 0 1 0 1.5H1.75A.75.75 0 0 1 1 2.75Zm0 5A.75.75 0 0 1 1.75 7h12.5a.75.75 0 0 1 0 1.5H1.75A.75.75 0 0 1 1 7.75ZM1.75 12h12.5a.75.75 0 0 1 0 1.5H1.75a.75.75 0 0 1 0-1.5Z"></path>
</svg>
</button>

<dialog-helper>
  <dialog data-target="deferred-side-panel.panel" id="dialog-19cb4a88-28f6-407d-a5ba-ad904c160266" aria-modal="true" aria-labelledby="dialog-19cb4a88-28f6-407d-a5ba-ad904c160266-title" aria-describedby="dialog-19cb4a88-28f6-407d-a5ba-ad904c160266-description" data-view-component="true" class="Overlay Overlay-whenNarrow Overlay--size-small-portrait Overlay--motion-scaleFade Overlay--placement-left SidePanel Overlay--disableScroll">
    <div styles="flex-direction: row;" data-view-component="true" class="Overlay-header">
  <div class="Overlay-headerContentWrap">
    <div class="Overlay-titleWrap">
      <h1 class="Overlay-title sr-only" id="dialog-19cb4a88-28f6-407d-a5ba-ad904c160266-title">
        Global navigation
      </h1>
            <div data-view-component="true" class="d-flex">
      <div data-view-component="true" class="AppHeader-logo position-relative">
        <svg aria-hidden="true" height="24" viewBox="0 0 24 24" version="1.1" width="24" data-view-component="true" class="octicon octicon-mark-github">
    <path d="M12.5.75C6.146.75 1 5.896 1 12.25c0 5.089 3.292 9.387 7.863 10.91.575.101.79-.244.79-.546 0-.273-.014-1.178-.014-2.142-2.889.532-3.636-.704-3.866-1.35-.13-.331-.69-1.352-1.18-1.625-.402-.216-.977-.748-.014-.762.906-.014 1.553.834 1.769 1.179 1.035 1.74 2.688 1.25 3.349.948.1-.747.402-1.25.733-1.538-2.559-.287-5.232-1.279-5.232-5.678 0-1.25.445-2.285 1.178-3.09-.115-.288-.517-1.467.115-3.048 0 0 .963-.302 3.163 1.179.92-.259 1.897-.388 2.875-.388.977 0 1.955.13 2.875.388 2.2-1.495 3.162-1.179 3.162-1.179.633 1.581.23 2.76.115 3.048.733.805 1.179 1.825 1.179 3.09 0 4.413-2.688 5.39-5.247 5.678.417.36.776 1.05.776 2.128 0 1.538-.014 2.774-.014 3.162 0 .302.216.662.79.547C20.709 21.637 24 17.324 24 12.25 24 5.896 18.854.75 12.5.75Z"></path>
</svg>
</div></div>
    </div>
    <div class="Overlay-actionWrap">
      <button data-close-dialog-id="dialog-19cb4a88-28f6-407d-a5ba-ad904c160266" aria-label="Close" type="button" data-view-component="true" class="close-button Overlay-closeButton"><svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-x">
    <path d="M3.72 3.72a.75.75 0 0 1 1.06 0L8 6.94l3.22-3.22a.749.749 0 0 1 1.275.326.749.749 0 0 1-.215.734L9.06 8l3.22 3.22a.749.749 0 0 1-.326 1.275.749.749 0 0 1-.734-.215L8 9.06l-3.22 3.22a.751.751 0 0 1-1.042-.018.751.751 0 0 1-.018-1.042L6.94 8 3.72 4.78a.75.75 0 0 1 0-1.06Z"></path>
</svg></button>
    </div>
  </div>
  
</div>
      <scrollable-region data-labelled-by="dialog-19cb4a88-28f6-407d-a5ba-ad904c160266-title" data-catalyst="" style="overflow: auto;">
        <div data-view-component="true" class="Overlay-body d-flex flex-column px-2">    <div data-view-component="true" class="d-flex flex-column mb-3">
        <nav aria-label="Site navigation" data-view-component="true" class="ActionList">
  
  <nav-list data-catalyst="">
    <ul data-target="nav-list.topLevelList" data-view-component="true" class="ActionListWrap">
        
          
<li data-item-id="" data-targets="nav-list.items" data-view-component="true" class="ActionListItem">
    
    
    <a data-hotkey="g d" data-analytics-event="{&quot;category&quot;:&quot;Global navigation&quot;,&quot;action&quot;:&quot;HOME&quot;,&quot;label&quot;:null}" id="item-74d17b1b-6be3-4e29-90f4-ccbdfc8ecc3c" href="https://github.com/dashboard" data-view-component="true" class="ActionListContent ActionListContent--visual16">
        <span class="ActionListItem-visual ActionListItem-visual--leading">
          <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-home">
    <path d="M6.906.664a1.749 1.749 0 0 1 2.187 0l5.25 4.2c.415.332.657.835.657 1.367v7.019A1.75 1.75 0 0 1 13.25 15h-3.5a.75.75 0 0 1-.75-.75V9H7v5.25a.75.75 0 0 1-.75.75h-3.5A1.75 1.75 0 0 1 1 13.25V6.23c0-.531.242-1.034.657-1.366l5.25-4.2Zm1.25 1.171a.25.25 0 0 0-.312 0l-5.25 4.2a.25.25 0 0 0-.094.196v7.019c0 .138.112.25.25.25H5.5V8.25a.75.75 0 0 1 .75-.75h3.5a.75.75 0 0 1 .75.75v5.25h2.75a.25.25 0 0 0 .25-.25V6.23a.25.25 0 0 0-.094-.195Z"></path>
</svg>
        </span>
      
        <span data-view-component="true" class="ActionListItem-label">
          Home
</span>      
</a>
  
</li>

        
          
<li data-item-id="" data-targets="nav-list.items" data-view-component="true" class="ActionListItem">
    
    
    <a data-hotkey="g i" data-analytics-event="{&quot;category&quot;:&quot;Global navigation&quot;,&quot;action&quot;:&quot;ISSUES&quot;,&quot;label&quot;:null}" id="item-1eeb2f58-959c-4e0c-833a-ef1ac3319cb3" href="https://github.com/issues" data-view-component="true" class="ActionListContent ActionListContent--visual16">
        <span class="ActionListItem-visual ActionListItem-visual--leading">
          <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-issue-opened">
    <path d="M8 9.5a1.5 1.5 0 1 0 0-3 1.5 1.5 0 0 0 0 3Z"></path><path d="M8 0a8 8 0 1 1 0 16A8 8 0 0 1 8 0ZM1.5 8a6.5 6.5 0 1 0 13 0 6.5 6.5 0 0 0-13 0Z"></path>
</svg>
        </span>
      
        <span data-view-component="true" class="ActionListItem-label">
          Issues
</span>      
</a>
  
</li>

        
          
<li data-item-id="" data-targets="nav-list.items" data-view-component="true" class="ActionListItem">
    
    
    <a data-hotkey="g p" data-analytics-event="{&quot;category&quot;:&quot;Global navigation&quot;,&quot;action&quot;:&quot;PULL_REQUESTS&quot;,&quot;label&quot;:null}" id="item-4d8f8c09-d796-4ff6-aff3-a2e1a1cb7096" href="https://github.com/pulls" data-view-component="true" class="ActionListContent ActionListContent--visual16">
        <span class="ActionListItem-visual ActionListItem-visual--leading">
          <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-git-pull-request">
    <path d="M1.5 3.25a2.25 2.25 0 1 1 3 2.122v5.256a2.251 2.251 0 1 1-1.5 0V5.372A2.25 2.25 0 0 1 1.5 3.25Zm5.677-.177L9.573.677A.25.25 0 0 1 10 .854V2.5h1A2.5 2.5 0 0 1 13.5 5v5.628a2.251 2.251 0 1 1-1.5 0V5a1 1 0 0 0-1-1h-1v1.646a.25.25 0 0 1-.427.177L7.177 3.427a.25.25 0 0 1 0-.354ZM3.75 2.5a.75.75 0 1 0 0 1.5.75.75 0 0 0 0-1.5Zm0 9.5a.75.75 0 1 0 0 1.5.75.75 0 0 0 0-1.5Zm8.25.75a.75.75 0 1 0 1.5 0 .75.75 0 0 0-1.5 0Z"></path>
</svg>
        </span>
      
        <span data-view-component="true" class="ActionListItem-label">
          Pull requests
</span>      
</a>
  
</li>

        
          
<li data-item-id="" data-targets="nav-list.items" data-view-component="true" class="ActionListItem">
    
    
    <a data-analytics-event="{&quot;category&quot;:&quot;Global navigation&quot;,&quot;action&quot;:&quot;PROJECTS&quot;,&quot;label&quot;:null}" id="item-9cd8940e-e717-455d-adb4-5d1cb7c2ca6f" href="https://github.com/projects" data-view-component="true" class="ActionListContent ActionListContent--visual16">
        <span class="ActionListItem-visual ActionListItem-visual--leading">
          <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-table">
    <path d="M0 1.75C0 .784.784 0 1.75 0h12.5C15.216 0 16 .784 16 1.75v12.5A1.75 1.75 0 0 1 14.25 16H1.75A1.75 1.75 0 0 1 0 14.25ZM6.5 6.5v8h7.75a.25.25 0 0 0 .25-.25V6.5Zm8-1.5V1.75a.25.25 0 0 0-.25-.25H6.5V5Zm-13 1.5v7.75c0 .138.112.25.25.25H5v-8ZM5 5V1.5H1.75a.25.25 0 0 0-.25.25V5Z"></path>
</svg>
        </span>
      
        <span data-view-component="true" class="ActionListItem-label">
          Projects
</span>      
</a>
  
</li>

        
          
<li data-item-id="" data-targets="nav-list.items" data-view-component="true" class="ActionListItem">
    
    
    <a data-analytics-event="{&quot;category&quot;:&quot;Global navigation&quot;,&quot;action&quot;:&quot;DISCUSSIONS&quot;,&quot;label&quot;:null}" id="item-e027b5ee-6b19-419f-b215-598721f571c5" href="https://github.com/discussions" data-view-component="true" class="ActionListContent ActionListContent--visual16">
        <span class="ActionListItem-visual ActionListItem-visual--leading">
          <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-comment-discussion">
    <path d="M1.75 1h8.5c.966 0 1.75.784 1.75 1.75v5.5A1.75 1.75 0 0 1 10.25 10H7.061l-2.574 2.573A1.458 1.458 0 0 1 2 11.543V10h-.25A1.75 1.75 0 0 1 0 8.25v-5.5C0 1.784.784 1 1.75 1ZM1.5 2.75v5.5c0 .138.112.25.25.25h1a.75.75 0 0 1 .75.75v2.19l2.72-2.72a.749.749 0 0 1 .53-.22h3.5a.25.25 0 0 0 .25-.25v-5.5a.25.25 0 0 0-.25-.25h-8.5a.25.25 0 0 0-.25.25Zm13 2a.25.25 0 0 0-.25-.25h-.5a.75.75 0 0 1 0-1.5h.5c.966 0 1.75.784 1.75 1.75v5.5A1.75 1.75 0 0 1 14.25 12H14v1.543a1.458 1.458 0 0 1-2.487 1.03L9.22 12.28a.749.749 0 0 1 .326-1.275.749.749 0 0 1 .734.215l2.22 2.22v-2.19a.75.75 0 0 1 .75-.75h1a.25.25 0 0 0 .25-.25Z"></path>
</svg>
        </span>
      
        <span data-view-component="true" class="ActionListItem-label">
          Discussions
</span>      
</a>
  
</li>

        
          
<li data-item-id="" data-targets="nav-list.items" data-view-component="true" class="ActionListItem">
    
    
    <a data-analytics-event="{&quot;category&quot;:&quot;Global navigation&quot;,&quot;action&quot;:&quot;CODESPACES&quot;,&quot;label&quot;:null}" id="item-78282822-1fe2-4a67-83b8-d5f81862a741" href="https://github.com/codespaces" data-view-component="true" class="ActionListContent ActionListContent--visual16">
        <span class="ActionListItem-visual ActionListItem-visual--leading">
          <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-codespaces">
    <path d="M0 11.25c0-.966.784-1.75 1.75-1.75h12.5c.966 0 1.75.784 1.75 1.75v3A1.75 1.75 0 0 1 14.25 16H1.75A1.75 1.75 0 0 1 0 14.25Zm2-9.5C2 .784 2.784 0 3.75 0h8.5C13.216 0 14 .784 14 1.75v5a1.75 1.75 0 0 1-1.75 1.75h-8.5A1.75 1.75 0 0 1 2 6.75Zm1.75-.25a.25.25 0 0 0-.25.25v5c0 .138.112.25.25.25h8.5a.25.25 0 0 0 .25-.25v-5a.25.25 0 0 0-.25-.25Zm-2 9.5a.25.25 0 0 0-.25.25v3c0 .138.112.25.25.25h12.5a.25.25 0 0 0 .25-.25v-3a.25.25 0 0 0-.25-.25Z"></path><path d="M7 12.75a.75.75 0 0 1 .75-.75h4.5a.75.75 0 0 1 0 1.5h-4.5a.75.75 0 0 1-.75-.75Zm-4 0a.75.75 0 0 1 .75-.75h.5a.75.75 0 0 1 0 1.5h-.5a.75.75 0 0 1-.75-.75Z"></path>
</svg>
        </span>
      
        <span data-view-component="true" class="ActionListItem-label">
          Codespaces
</span>      
</a>
  
</li>

        
          
<li data-item-id="" data-targets="nav-list.items" data-view-component="true" class="ActionListItem">
    
    
    <a data-analytics-event="{&quot;category&quot;:&quot;Global navigation&quot;,&quot;action&quot;:&quot;COPILOT&quot;,&quot;label&quot;:null}" id="item-3aa1d276-6bb0-479f-996a-3be9b43e97f2" href="https://github.com/copilot" data-view-component="true" class="ActionListContent ActionListContent--visual16">
        <span class="ActionListItem-visual ActionListItem-visual--leading">
          <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-copilot">
    <path d="M7.998 15.035c-4.562 0-7.873-2.914-7.998-3.749V9.338c.085-.628.677-1.686 1.588-2.065.013-.07.024-.143.036-.218.029-.183.06-.384.126-.612-.201-.508-.254-1.084-.254-1.656 0-.87.128-1.769.693-2.484.579-.733 1.494-1.124 2.724-1.261 1.206-.134 2.262.034 2.944.765.05.053.096.108.139.165.044-.057.094-.112.143-.165.682-.731 1.738-.899 2.944-.765 1.23.137 2.145.528 2.724 1.261.566.715.693 1.614.693 2.484 0 .572-.053 1.148-.254 1.656.066.228.098.429.126.612.012.076.024.148.037.218.924.385 1.522 1.471 1.591 2.095v1.872c0 .766-3.351 3.795-8.002 3.795Zm0-1.485c2.28 0 4.584-1.11 5.002-1.433V7.862l-.023-.116c-.49.21-1.075.291-1.727.291-1.146 0-2.059-.327-2.71-.991A3.222 3.222 0 0 1 8 6.303a3.24 3.24 0 0 1-.544.743c-.65.664-1.563.991-2.71.991-.652 0-1.236-.081-1.727-.291l-.023.116v4.255c.419.323 2.722 1.433 5.002 1.433ZM6.762 2.83c-.193-.206-.637-.413-1.682-.297-1.019.113-1.479.404-1.713.7-.247.312-.369.789-.369 1.554 0 .793.129 1.171.308 1.371.162.181.519.379 1.442.379.853 0 1.339-.235 1.638-.54.315-.322.527-.827.617-1.553.117-.935-.037-1.395-.241-1.614Zm4.155-.297c-1.044-.116-1.488.091-1.681.297-.204.219-.359.679-.242 1.614.091.726.303 1.231.618 1.553.299.305.784.54 1.638.54.922 0 1.28-.198 1.442-.379.179-.2.308-.578.308-1.371 0-.765-.123-1.242-.37-1.554-.233-.296-.693-.587-1.713-.7Z"></path><path d="M6.25 9.037a.75.75 0 0 1 .75.75v1.501a.75.75 0 0 1-1.5 0V9.787a.75.75 0 0 1 .75-.75Zm4.25.75v1.501a.75.75 0 0 1-1.5 0V9.787a.75.75 0 0 1 1.5 0Z"></path>
</svg>
        </span>
      
        <span data-view-component="true" class="ActionListItem-label">
          Copilot
</span>      
</a>
  
</li>

        
          <li role="presentation" aria-hidden="true" data-view-component="true" class="ActionList-sectionDivider"></li>
        
          
<li data-item-id="" data-targets="nav-list.items" data-view-component="true" class="ActionListItem">
    
    
    <a data-analytics-event="{&quot;category&quot;:&quot;Global navigation&quot;,&quot;action&quot;:&quot;EXPLORE&quot;,&quot;label&quot;:null}" id="item-15ae541f-8dd8-4724-892c-f7861fb8407b" href="https://github.com/explore" data-view-component="true" class="ActionListContent ActionListContent--visual16">
        <span class="ActionListItem-visual ActionListItem-visual--leading">
          <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-telescope">
    <path d="M14.184 1.143v-.001l1.422 2.464a1.75 1.75 0 0 1-.757 2.451L3.104 11.713a1.75 1.75 0 0 1-2.275-.702l-.447-.775a1.75 1.75 0 0 1 .53-2.32L11.682.573a1.748 1.748 0 0 1 2.502.57Zm-4.709 9.32h-.001l2.644 3.863a.75.75 0 1 1-1.238.848l-1.881-2.75v2.826a.75.75 0 0 1-1.5 0v-2.826l-1.881 2.75a.75.75 0 1 1-1.238-.848l2.049-2.992a.746.746 0 0 1 .293-.253l1.809-.87a.749.749 0 0 1 .944.252ZM9.436 3.92h-.001l-4.97 3.39.942 1.63 5.42-2.61Zm3.091-2.108h.001l-1.85 1.26 1.505 2.605 2.016-.97a.247.247 0 0 0 .13-.151.247.247 0 0 0-.022-.199l-1.422-2.464a.253.253 0 0 0-.161-.119.254.254 0 0 0-.197.038ZM1.756 9.157a.25.25 0 0 0-.075.33l.447.775a.25.25 0 0 0 .325.1l1.598-.769-.83-1.436-1.465 1Z"></path>
</svg>
        </span>
      
        <span data-view-component="true" class="ActionListItem-label">
          Explore
</span>      
</a>
  
</li>

        
          
<li data-item-id="" data-targets="nav-list.items" data-view-component="true" class="ActionListItem">
    
    
    <a data-analytics-event="{&quot;category&quot;:&quot;Global navigation&quot;,&quot;action&quot;:&quot;MARKETPLACE&quot;,&quot;label&quot;:null}" id="item-745f8d12-f6b3-4524-b04c-800798398d11" href="https://github.com/marketplace" data-view-component="true" class="ActionListContent ActionListContent--visual16">
        <span class="ActionListItem-visual ActionListItem-visual--leading">
          <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-gift">
    <path d="M2 2.75A2.75 2.75 0 0 1 4.75 0c.983 0 1.873.42 2.57 1.232.268.318.497.668.68 1.042.183-.375.411-.725.68-1.044C9.376.42 10.266 0 11.25 0a2.75 2.75 0 0 1 2.45 4h.55c.966 0 1.75.784 1.75 1.75v2c0 .698-.409 1.301-1 1.582v4.918A1.75 1.75 0 0 1 13.25 16H2.75A1.75 1.75 0 0 1 1 14.25V9.332C.409 9.05 0 8.448 0 7.75v-2C0 4.784.784 4 1.75 4h.55c-.192-.375-.3-.8-.3-1.25ZM7.25 9.5H2.5v4.75c0 .138.112.25.25.25h4.5Zm1.5 0v5h4.5a.25.25 0 0 0 .25-.25V9.5Zm0-4V8h5.5a.25.25 0 0 0 .25-.25v-2a.25.25 0 0 0-.25-.25Zm-7 0a.25.25 0 0 0-.25.25v2c0 .138.112.25.25.25h5.5V5.5h-5.5Zm3-4a1.25 1.25 0 0 0 0 2.5h2.309c-.233-.818-.542-1.401-.878-1.793-.43-.502-.915-.707-1.431-.707ZM8.941 4h2.309a1.25 1.25 0 0 0 0-2.5c-.516 0-1 .205-1.43.707-.337.392-.646.975-.879 1.793Z"></path>
</svg>
        </span>
      
        <span data-view-component="true" class="ActionListItem-label">
          Marketplace
</span>      
</a>
  
</li>

</ul>  </nav-list>
</nav>

        <div data-view-component="true" class="my-3 d-flex flex-justify-center height-full">
          <span data-view-component="true">
  <svg style="box-sizing: content-box; color: var(--color-icon-primary);" width="16" height="16" viewBox="0 0 16 16" fill="none" aria-hidden="true" data-view-component="true" class="anim-rotate">
    <circle cx="8" cy="8" r="7" stroke="currentColor" stroke-opacity="0.25" stroke-width="2" vector-effect="non-scaling-stroke" fill="none"></circle>
    <path d="M15 8a7.002 7.002 0 00-7-7" stroke="currentColor" stroke-width="2" stroke-linecap="round" vector-effect="non-scaling-stroke"></path>
</svg>    <span class="sr-only">Loading</span>
</span>
</div>
</div>
      <div data-view-component="true" class="flex-1"></div>


      <div data-view-component="true" class="px-2">      <p class="color-fg-subtle text-small text-light">© 2025 GitHub, Inc.</p>

      <div data-view-component="true" class="d-flex flex-wrap text-small text-light">
          <a target="_blank" href="https://github.com/about" data-view-component="true" class="Link mr-2">About</a>
          <a target="_blank" href="https://github.blog/" data-view-component="true" class="Link mr-2">Blog</a>
          <a target="_blank" href="https://docs.github.com/site-policy/github-terms/github-terms-of-service" data-view-component="true" class="Link mr-2">Terms</a>
          <a target="_blank" href="https://docs.github.com/site-policy/privacy-policies/github-privacy-statement" data-view-component="true" class="Link mr-2">Privacy</a>
          <a target="_blank" href="https://github.com/security" data-view-component="true" class="Link mr-2">Security</a>
          <a target="_blank" href="https://www.githubstatus.com/" data-view-component="true" class="Link mr-3">Status</a>

</div></div>
</div>
      </scrollable-region>
      
</dialog></dialog-helper>

  </include-fragment>
</deferred-side-panel>

        <a class="AppHeader-logo ml-1" href="https://github.com/" data-hotkey="g d" aria-label="Homepage " data-turbo="false" data-analytics-event="{&quot;category&quot;:&quot;Header&quot;,&quot;action&quot;:&quot;go to dashboard&quot;,&quot;label&quot;:&quot;icon:logo&quot;}">
          <svg height="32" aria-hidden="true" viewBox="0 0 24 24" version="1.1" width="32" data-view-component="true" class="octicon octicon-mark-github v-align-middle">
    <path d="M12.5.75C6.146.75 1 5.896 1 12.25c0 5.089 3.292 9.387 7.863 10.91.575.101.79-.244.79-.546 0-.273-.014-1.178-.014-2.142-2.889.532-3.636-.704-3.866-1.35-.13-.331-.69-1.352-1.18-1.625-.402-.216-.977-.748-.014-.762.906-.014 1.553.834 1.769 1.179 1.035 1.74 2.688 1.25 3.349.948.1-.747.402-1.25.733-1.538-2.559-.287-5.232-1.279-5.232-5.678 0-1.25.445-2.285 1.178-3.09-.115-.288-.517-1.467.115-3.048 0 0 .963-.302 3.163 1.179.92-.259 1.897-.388 2.875-.388.977 0 1.955.13 2.875.388 2.2-1.495 3.162-1.179 3.162-1.179.633 1.581.23 2.76.115 3.048.733.805 1.179 1.825 1.179 3.09 0 4.413-2.688 5.39-5.247 5.678.417.36.776 1.05.776 2.128 0 1.538-.014 2.774-.014 3.162 0 .302.216.662.79.547C20.709 21.637 24 17.324 24 12.25 24 5.896 18.854.75 12.5.75Z"></path>
</svg>
        </a>

          <div class="AppHeader-context">
  <div class="AppHeader-context-compact">
      <button aria-expanded="false" aria-haspopup="dialog" aria-label="Page context: AmirishettyAkhila / web-technologies2025" id="dialog-show-context-region-dialog" data-show-dialog-id="context-region-dialog" type="button" data-view-component="true" class="AppHeader-context-compact-trigger Truncate Button--secondary Button--medium Button box-shadow-none">  <span class="Button-content">
    <span class="Button-label"><span class="AppHeader-context-compact-lead">
                <span class="AppHeader-context-compact-parentItem">AmirishettyAkhila</span>
                <span class="no-wrap">&nbsp;/</span>

            </span>

            <strong class="AppHeader-context-compact-mainItem d-flex flex-items-center Truncate">
  <span class="Truncate-text ">web-technologies2025</span>

</strong></span>
  </span>
</button>

<dialog-helper>
  <dialog id="context-region-dialog" aria-modal="true" aria-labelledby="context-region-dialog-title" aria-describedby="context-region-dialog-description" data-view-component="true" class="Overlay Overlay-whenNarrow Overlay--size-medium Overlay--motion-scaleFade Overlay--disableScroll">
    <div data-view-component="true" class="Overlay-header">
  <div class="Overlay-headerContentWrap">
    <div class="Overlay-titleWrap">
      <h1 class="Overlay-title " id="context-region-dialog-title">
        Navigate back to
      </h1>
        
    </div>
    <div class="Overlay-actionWrap">
      <button data-close-dialog-id="context-region-dialog" aria-label="Close" type="button" data-view-component="true" class="close-button Overlay-closeButton"><svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-x">
    <path d="M3.72 3.72a.75.75 0 0 1 1.06 0L8 6.94l3.22-3.22a.749.749 0 0 1 1.275.326.749.749 0 0 1-.215.734L9.06 8l3.22 3.22a.749.749 0 0 1-.326 1.275.749.749 0 0 1-.734-.215L8 9.06l-3.22 3.22a.751.751 0 0 1-1.042-.018.751.751 0 0 1-.018-1.042L6.94 8 3.72 4.78a.75.75 0 0 1 0-1.06Z"></path>
</svg></button>
    </div>
  </div>
  
</div>
      <scrollable-region data-labelled-by="context-region-dialog-title" data-catalyst="" style="overflow: auto;">
        <div data-view-component="true" class="Overlay-body">          <ul role="list" class="list-style-none">
    <li>
      <a data-analytics-event="{&quot;category&quot;:&quot;SiteHeaderComponent&quot;,&quot;action&quot;:&quot;context_region_crumb&quot;,&quot;label&quot;:&quot;AmirishettyAkhila&quot;,&quot;screen_size&quot;:&quot;compact&quot;}" href="https://github.com/AmirishettyAkhila" data-view-component="true" class="Link--primary Truncate d-flex flex-items-center py-1">
        <span class="AppHeader-context-item-label Truncate-text ">
            <svg aria-hidden="true" height="12" viewBox="0 0 16 16" version="1.1" width="12" data-view-component="true" class="octicon octicon-person mr-1">
    <path d="M10.561 8.073a6.005 6.005 0 0 1 3.432 5.142.75.75 0 1 1-1.498.07 4.5 4.5 0 0 0-8.99 0 .75.75 0 0 1-1.498-.07 6.004 6.004 0 0 1 3.431-5.142 3.999 3.999 0 1 1 5.123 0ZM10.5 5a2.5 2.5 0 1 0-5 0 2.5 2.5 0 0 0 5 0Z"></path>
</svg>

          AmirishettyAkhila
        </span>

</a>
    </li>
    <li>
      <a data-analytics-event="{&quot;category&quot;:&quot;SiteHeaderComponent&quot;,&quot;action&quot;:&quot;context_region_crumb&quot;,&quot;label&quot;:&quot;web-technologies2025&quot;,&quot;screen_size&quot;:&quot;compact&quot;}" href="https://github.com/AmirishettyAkhila/web-technologies2025" data-view-component="true" class="Link--primary Truncate d-flex flex-items-center py-1">
        <span class="AppHeader-context-item-label Truncate-text ">
            <svg aria-hidden="true" height="12" viewBox="0 0 16 16" version="1.1" width="12" data-view-component="true" class="octicon octicon-repo mr-1">
    <path d="M2 2.5A2.5 2.5 0 0 1 4.5 0h8.75a.75.75 0 0 1 .75.75v12.5a.75.75 0 0 1-.75.75h-2.5a.75.75 0 0 1 0-1.5h1.75v-2h-8a1 1 0 0 0-.714 1.7.75.75 0 1 1-1.072 1.05A2.495 2.495 0 0 1 2 11.5Zm10.5-1h-8a1 1 0 0 0-1 1v6.708A2.486 2.486 0 0 1 4.5 9h8ZM5 12.25a.25.25 0 0 1 .25-.25h3.5a.25.25 0 0 1 .25.25v3.25a.25.25 0 0 1-.4.2l-1.45-1.087a.249.249 0 0 0-.3 0L5.4 15.7a.25.25 0 0 1-.4-.2Z"></path>
</svg>

          web-technologies2025
        </span>

</a>
    </li>
</ul>

</div>
      </scrollable-region>
      
</dialog></dialog-helper>
  </div>

  <div class="AppHeader-context-full">
    <nav role="navigation" aria-label="Page context">
      <ul role="list" class="list-style-none">
    <li>
      <a data-analytics-event="{&quot;category&quot;:&quot;SiteHeaderComponent&quot;,&quot;action&quot;:&quot;context_region_crumb&quot;,&quot;label&quot;:&quot;AmirishettyAkhila&quot;,&quot;screen_size&quot;:&quot;full&quot;}" data-hovercard-type="user" data-hovercard-url="/users/AmirishettyAkhila/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/AmirishettyAkhila" data-view-component="true" class="AppHeader-context-item">
        <span class="AppHeader-context-item-label  ">

          AmirishettyAkhila
        </span>

</a>
        <span class="AppHeader-context-item-separator">
          <span class="sr-only">/</span>
          <svg width="16" height="16" viewBox="0 0 16 16" xmlns="http://www.w3.org/2000/svg" aria-hidden="true">
            <path d="M10.956 1.27994L6.06418 14.7201L5 14.7201L9.89181 1.27994L10.956 1.27994Z" fill="currentcolor"></path>
          </svg>
        </span>
    </li>
    <li>
      <a data-analytics-event="{&quot;category&quot;:&quot;SiteHeaderComponent&quot;,&quot;action&quot;:&quot;context_region_crumb&quot;,&quot;label&quot;:&quot;web-technologies2025&quot;,&quot;screen_size&quot;:&quot;full&quot;}" href="https://github.com/AmirishettyAkhila/web-technologies2025" data-view-component="true" class="AppHeader-context-item">
        <span class="AppHeader-context-item-label  ">

          web-technologies2025
        </span>

</a>
    </li>
</ul>

    </nav>
  </div>
</div>

      </div>
      <div class="AppHeader-globalBar-end">
          <div class="AppHeader-search">
              


<qbsearch-input class="search-input" data-scope="repo:AmirishettyAkhila/web-technologies2025" data-custom-scopes-path="/search/custom_scopes" data-delete-custom-scopes-csrf="UQaCejA-QthGVD2qCkskGox8DPhZWcxMRcvNCIm73KNjgaACHnjRjrgwGGtHLx0korn76e4sfqbCm8OF2IHwNQ" data-max-custom-scopes="10" data-header-redesign-enabled="true" data-initial-value="" data-blackbird-suggestions-path="/search/suggestions" data-jump-to-suggestions-path="/_graphql/GetSuggestedNavigationDestinations" data-current-repository="AmirishettyAkhila/web-technologies2025" data-current-org="" data-current-owner="AmirishettyAkhila" data-logged-in="true" data-copilot-chat-enabled="true" data-nl-search-enabled="false" data-catalyst="">
  <div class="search-input-container search-with-dialog position-relative d-flex flex-row flex-items-center height-auto color-bg-transparent border-0 color-fg-subtle mx-0" data-action="click:qbsearch-input#searchInputContainerClicked">
      
            <button type="button" data-action="click:qbsearch-input#handleExpand" class="AppHeader-button AppHeader-search-whenNarrow" aria-label="Search or jump to…" aria-expanded="false" aria-haspopup="dialog">
            <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-search">
    <path d="M10.68 11.74a6 6 0 0 1-7.922-8.982 6 6 0 0 1 8.982 7.922l3.04 3.04a.749.749 0 0 1-.326 1.275.749.749 0 0 1-.734-.215ZM11.5 7a4.499 4.499 0 1 0-8.997 0A4.499 4.499 0 0 0 11.5 7Z"></path>
</svg>
          </button>


<div class="AppHeader-search-whenRegular">
  <div class="AppHeader-search-wrap AppHeader-search-wrap--hasTrailing">
    <div class="AppHeader-search-control AppHeader-search-control-overflow">
      <label for="AppHeader-searchInput" aria-label="Search or jump to…" class="AppHeader-search-visual--leading">
        <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-search">
    <path d="M10.68 11.74a6 6 0 0 1-7.922-8.982 6 6 0 0 1 8.982 7.922l3.04 3.04a.749.749 0 0 1-.326 1.275.749.749 0 0 1-.734-.215ZM11.5 7a4.499 4.499 0 1 0-8.997 0A4.499 4.499 0 0 0 11.5 7Z"></path>
</svg>
      </label>

                <button type="button" data-target="qbsearch-input.inputButton" data-action="click:qbsearch-input#handleExpand" class="AppHeader-searchButton form-control input-contrast text-left color-fg-subtle no-wrap placeholder" data-hotkey="s,/" data-analytics-event="{&quot;location&quot;:&quot;navbar&quot;,&quot;action&quot;:&quot;searchbar&quot;,&quot;context&quot;:&quot;global&quot;,&quot;tag&quot;:&quot;input&quot;,&quot;label&quot;:&quot;searchbar_input_global_navbar&quot;}" aria-describedby="search-error-message-flash">
            <div class="overflow-hidden">
              <span id="qb-input-query" data-target="qbsearch-input.inputButtonText">
                  Type <kbd class="AppHeader-search-kbd">/</kbd> to search
              </span>
            </div>
          </button>

    </div>


  </div>
</div>

    <input type="hidden" name="type" class="js-site-search-type-field">

    
<div class="Overlay--hidden " data-modal-dialog-overlay="">
  <modal-dialog data-action="close:qbsearch-input#handleClose cancel:qbsearch-input#handleClose" data-target="qbsearch-input.searchSuggestionsDialog" role="dialog" id="search-suggestions-dialog" aria-modal="true" aria-labelledby="search-suggestions-dialog-header" data-view-component="true" class="Overlay Overlay--width-medium Overlay--height-auto">
      <h1 id="search-suggestions-dialog-header" class="sr-only">Search code, repositories, users, issues, pull requests...</h1>
    <div class="Overlay-body Overlay-body--paddingNone">
      
          <div data-view-component="true">        <div class="search-suggestions position-absolute width-full color-shadow-large border color-fg-default color-bg-default overflow-hidden d-flex flex-column query-builder-container" style="border-radius: 12px;" data-target="qbsearch-input.queryBuilderContainer" hidden="">
          <!-- '"` --><!-- </textarea></xmp> --><form id="query-builder-test-form" action="https://github.com/AmirishettyAkhila/web-technologies2025/blob/main/CollegeManagementSystem.java" accept-charset="UTF-8" method="get">
  <query-builder data-target="qbsearch-input.queryBuilder" id="query-builder-query-builder-test" data-filter-key=":" data-view-component="true" class="QueryBuilder search-query-builder" data-min-width="300" data-catalyst="">
    <div class="FormControl FormControl--fullWidth">
      <label id="query-builder-test-label" for="query-builder-test" class="FormControl-label sr-only">
        Search
      </label>
      <div class="QueryBuilder-StyledInput width-fit " data-target="query-builder.styledInput">
          <span id="query-builder-test-leadingvisual-wrap" class="FormControl-input-leadingVisualWrap QueryBuilder-leadingVisualWrap">
            <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-search FormControl-input-leadingVisual">
    <path d="M10.68 11.74a6 6 0 0 1-7.922-8.982 6 6 0 0 1 8.982 7.922l3.04 3.04a.749.749 0 0 1-.326 1.275.749.749 0 0 1-.734-.215ZM11.5 7a4.499 4.499 0 1 0-8.997 0A4.499 4.499 0 0 0 11.5 7Z"></path>
</svg>
          </span>
        <div data-target="query-builder.styledInputContainer" class="QueryBuilder-StyledInputContainer">
          <div aria-hidden="true" class="QueryBuilder-StyledInputContent" data-target="query-builder.styledInputContent"></div>
          <div class="QueryBuilder-InputWrapper">
            <div aria-hidden="true" class="QueryBuilder-Sizer" data-target="query-builder.sizer"><span></span></div>
            <input id="query-builder-test" name="query-builder-test" value="" autocomplete="off" type="text" role="combobox" spellcheck="false" aria-expanded="false" aria-describedby="validation-a87d27c1-d2b4-4c1f-9d69-f931495dcb07" data-target="query-builder.input" data-action="
          input:query-builder#inputChange
          blur:query-builder#inputBlur
          keydown:query-builder#inputKeydown
          focus:query-builder#inputFocus
        " data-view-component="true" class="FormControl-input QueryBuilder-Input FormControl-medium" aria-controls="query-builder-test-results" aria-autocomplete="list" aria-haspopup="listbox" style="width: 300px;">
          </div>
        </div>
          <span class="sr-only" id="query-builder-test-clear">Clear</span>
          <button role="button" id="query-builder-test-clear-button" aria-labelledby="query-builder-test-clear query-builder-test-label" data-target="query-builder.clearButton" data-action="
                click:query-builder#clear
                focus:query-builder#clearButtonFocus
                blur:query-builder#clearButtonBlur
              " variant="small" hidden="" type="button" data-view-component="true" class="Button Button--iconOnly Button--invisible Button--medium mr-1 px-2 py-0 d-flex flex-items-center rounded-1 color-fg-muted">  <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-x-circle-fill Button-visual">
    <path d="M2.343 13.657A8 8 0 1 1 13.658 2.343 8 8 0 0 1 2.343 13.657ZM6.03 4.97a.751.751 0 0 0-1.042.018.751.751 0 0 0-.018 1.042L6.94 8 4.97 9.97a.749.749 0 0 0 .326 1.275.749.749 0 0 0 .734-.215L8 9.06l1.97 1.97a.749.749 0 0 0 1.275-.326.749.749 0 0 0-.215-.734L9.06 8l1.97-1.97a.749.749 0 0 0-.326-1.275.749.749 0 0 0-.734.215L8 6.94Z"></path>
</svg>
</button>

      </div>
      <template id="search-icon"></template>

<template id="code-icon"></template>

<template id="file-code-icon"></template>

<template id="history-icon"></template>

<template id="repo-icon"></template>

<template id="bookmark-icon"></template>

<template id="plus-circle-icon"></template>

<template id="circle-icon"></template>

<template id="trash-icon"></template>

<template id="team-icon"></template>

<template id="project-icon"></template>

<template id="pencil-icon"></template>

<template id="copilot-icon"></template>

<template id="copilot-error-icon"></template>

<template id="workflow-icon"></template>

<template id="book-icon"></template>

<template id="code-review-icon"></template>

<template id="codespaces-icon"></template>

<template id="comment-icon"></template>

<template id="comment-discussion-icon"></template>

<template id="organization-icon"></template>

<template id="rocket-icon"></template>

<template id="shield-check-icon"></template>

<template id="heart-icon"></template>

<template id="server-icon"></template>

<template id="globe-icon"></template>

<template id="issue-opened-icon"></template>

<template id="device-mobile-icon"></template>

<template id="package-icon"></template>

<template id="credit-card-icon"></template>

<template id="play-icon"></template>

<template id="gift-icon"></template>

<template id="code-square-icon"></template>

<template id="device-desktop-icon"></template>

        <div class="position-relative">
                <ul role="listbox" class="ActionListWrap QueryBuilder-ListWrap" aria-label="Suggestions" data-action="
                    combobox-commit:query-builder#comboboxCommit
                    mousedown:query-builder#resultsMousedown
                  " data-target="query-builder.resultsList" data-persist-list="false" id="query-builder-test-results"></ul>
        </div>
      <div class="FormControl-inlineValidation" id="validation-a87d27c1-d2b4-4c1f-9d69-f931495dcb07" hidden="hidden">
        <span class="FormControl-inlineValidation--visual">
          <svg aria-hidden="true" height="12" viewBox="0 0 12 12" version="1.1" width="12" data-view-component="true" class="octicon octicon-alert-fill">
    <path d="M4.855.708c.5-.896 1.79-.896 2.29 0l4.675 8.351a1.312 1.312 0 0 1-1.146 1.954H1.33A1.313 1.313 0 0 1 .183 9.058ZM7 7V3H5v4Zm-1 3a1 1 0 1 0 0-2 1 1 0 0 0 0 2Z"></path>
</svg>
        </span>
        <span></span>
</div>    </div>
    <div data-target="query-builder.screenReaderFeedback" aria-live="polite" aria-atomic="true" class="sr-only">0 suggestions.</div>
</query-builder></form>
          <div class="d-flex flex-row color-fg-muted px-3 text-small color-bg-default search-feedback-prompt">
            <a target="_blank" href="https://docs.github.com/search-github/github-code-search/understanding-github-code-search-syntax" data-view-component="true" class="Link color-fg-accent text-normal ml-2">Search syntax tips</a>            <div class="d-flex flex-1"></div>
              <button data-action="click:qbsearch-input#showFeedbackDialog" type="button" data-view-component="true" class="Button--link Button--medium Button color-fg-accent text-normal ml-2">  <span class="Button-content">
    <span class="Button-label">Give feedback</span>
  </span>
</button>
          </div>
        </div>
</div>

    </div>
</modal-dialog></div>
  </div>
  <div data-action="click:qbsearch-input#retract" class="dark-backdrop position-fixed" hidden="" data-target="qbsearch-input.darkBackdrop"></div>
  <div class="color-fg-default">
    
<dialog-helper>
  <dialog data-target="qbsearch-input.feedbackDialog" data-action="close:qbsearch-input#handleDialogClose cancel:qbsearch-input#handleDialogClose" id="feedback-dialog" aria-modal="true" aria-labelledby="feedback-dialog-title" aria-describedby="feedback-dialog-description" data-view-component="true" class="Overlay Overlay-whenNarrow Overlay--size-medium Overlay--motion-scaleFade Overlay--disableScroll">
    <div data-view-component="true" class="Overlay-header">
  <div class="Overlay-headerContentWrap">
    <div class="Overlay-titleWrap">
      <h1 class="Overlay-title " id="feedback-dialog-title">
        Provide feedback
      </h1>
        
    </div>
    <div class="Overlay-actionWrap">
      <button data-close-dialog-id="feedback-dialog" aria-label="Close" type="button" data-view-component="true" class="close-button Overlay-closeButton"><svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-x">
    <path d="M3.72 3.72a.75.75 0 0 1 1.06 0L8 6.94l3.22-3.22a.749.749 0 0 1 1.275.326.749.749 0 0 1-.215.734L9.06 8l3.22 3.22a.749.749 0 0 1-.326 1.275.749.749 0 0 1-.734-.215L8 9.06l-3.22 3.22a.751.751 0 0 1-1.042-.018.751.751 0 0 1-.018-1.042L6.94 8 3.72 4.78a.75.75 0 0 1 0-1.06Z"></path>
</svg></button>
    </div>
  </div>
  
</div>
      <scrollable-region data-labelled-by="feedback-dialog-title" data-catalyst="" style="overflow: auto;">
        <div data-view-component="true" class="Overlay-body">        <!-- '"` --><!-- </textarea></xmp> --><form id="code-search-feedback-form" data-turbo="false" action="https://github.com/search/feedback" accept-charset="UTF-8" method="post"><input type="hidden" name="authenticity_token" value="IAagXT-Valc__Bc-ZLMcIOZtQsEVrE_c_zXFb8pGf2cSIAsEMGYdFDmZ528T_zFlMgZ4QjFDtJAbuFaNvDTzEA">
          <p>We read every piece of feedback, and take your input very seriously.</p>
          <textarea name="feedback" class="form-control width-full mb-2" style="height: 120px" id="feedback"></textarea>
          <input name="include_email" id="include_email" aria-label="Include my email address so I can be contacted" class="form-control mr-2" type="checkbox">
          <label for="include_email" style="font-weight: normal">Include my email address so I can be contacted</label>
</form></div>
      </scrollable-region>
      <div data-view-component="true" class="Overlay-footer Overlay-footer--alignEnd">          <button data-close-dialog-id="feedback-dialog" type="button" data-view-component="true" class="btn">    Cancel
</button>
          <button form="code-search-feedback-form" data-action="click:qbsearch-input#submitFeedback" type="submit" data-view-component="true" class="btn-primary btn">    Submit feedback
</button>
</div>
</dialog></dialog-helper>

    <custom-scopes data-target="qbsearch-input.customScopesManager" data-catalyst="">
    
<dialog-helper>
  <dialog data-target="custom-scopes.customScopesModalDialog" data-action="close:qbsearch-input#handleDialogClose cancel:qbsearch-input#handleDialogClose" id="custom-scopes-dialog" aria-modal="true" aria-labelledby="custom-scopes-dialog-title" aria-describedby="custom-scopes-dialog-description" data-view-component="true" class="Overlay Overlay-whenNarrow Overlay--size-medium Overlay--motion-scaleFade Overlay--disableScroll">
    <div data-view-component="true" class="Overlay-header Overlay-header--divided">
  <div class="Overlay-headerContentWrap">
    <div class="Overlay-titleWrap">
      <h1 class="Overlay-title " id="custom-scopes-dialog-title">
        Saved searches
      </h1>
        <h2 id="custom-scopes-dialog-description" class="Overlay-description">Use saved searches to filter your results more quickly</h2>
    </div>
    <div class="Overlay-actionWrap">
      <button data-close-dialog-id="custom-scopes-dialog" aria-label="Close" type="button" data-view-component="true" class="close-button Overlay-closeButton"><svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-x">
    <path d="M3.72 3.72a.75.75 0 0 1 1.06 0L8 6.94l3.22-3.22a.749.749 0 0 1 1.275.326.749.749 0 0 1-.215.734L9.06 8l3.22 3.22a.749.749 0 0 1-.326 1.275.749.749 0 0 1-.734-.215L8 9.06l-3.22 3.22a.751.751 0 0 1-1.042-.018.751.751 0 0 1-.018-1.042L6.94 8 3.72 4.78a.75.75 0 0 1 0-1.06Z"></path>
</svg></button>
    </div>
  </div>
  
</div>
      <scrollable-region data-labelled-by="custom-scopes-dialog-title" data-catalyst="" style="overflow: auto;">
        <div data-view-component="true" class="Overlay-body">        <div data-target="custom-scopes.customScopesModalDialogFlash"></div>

        <div hidden="" class="create-custom-scope-form" data-target="custom-scopes.createCustomScopeForm">
        <!-- '"` --><!-- </textarea></xmp> --><form id="custom-scopes-dialog-form" data-turbo="false" action="https://github.com/search/custom_scopes" accept-charset="UTF-8" method="post"><input type="hidden" name="authenticity_token" value="MGrj8ZbU70v7MB-hJNw3NdEgASg1u5hkC2iib22-pzA8Qf3-ftxo-U9ELHVi7KTcca_bnImxnQhs-Lq5fH3zpg">
          <div data-target="custom-scopes.customScopesModalDialogFlash"></div>

          <input type="hidden" id="custom_scope_id" name="custom_scope_id" data-target="custom-scopes.customScopesIdField">

          <div class="form-group">
            <label for="custom_scope_name">Name</label>
            <auto-check src="/search/custom_scopes/check_name" required="" only-validate-on-blur="false">
              <input type="text" name="custom_scope_name" id="custom_scope_name" data-target="custom-scopes.customScopesNameField" class="form-control" autocomplete="off" placeholder="github-ruby" required="" maxlength="50" spellcheck="false">
              <input type="hidden" value="3zt9KVhhW8oShtRceafeLykn0ntQtxa-sshHNPTQkNCHdEYIbtbiFVfiTet6QspqFLnZpLmFzZ91HKfylbvDyw" data-csrf="true">
            </auto-check>
          </div>

          <div class="form-group">
            <label for="custom_scope_query">Query</label>
            <input type="text" name="custom_scope_query" id="custom_scope_query" data-target="custom-scopes.customScopesQueryField" class="form-control" autocomplete="off" placeholder="(repo:mona/a OR repo:mona/b) AND lang:python" required="" maxlength="500">
          </div>

          <p class="text-small color-fg-muted">
            To see all available qualifiers, see our <a class="Link--inTextBlock" href="https://docs.github.com/search-github/github-code-search/understanding-github-code-search-syntax">documentation</a>.
          </p>
</form>        </div>

        <div data-target="custom-scopes.manageCustomScopesForm">
          <div data-target="custom-scopes.list"></div>
        </div>

</div>
      </scrollable-region>
      <div data-view-component="true" class="Overlay-footer Overlay-footer--alignEnd Overlay-footer--divided">          <button data-action="click:custom-scopes#customScopesCancel" type="button" data-view-component="true" class="btn">    Cancel
</button>
          <button form="custom-scopes-dialog-form" data-action="click:custom-scopes#customScopesSubmit" data-target="custom-scopes.customScopesSubmitButton" type="submit" data-view-component="true" class="btn-primary btn">    Create saved search
</button>
</div>
</dialog></dialog-helper>
    </custom-scopes>
  </div>
</qbsearch-input>  <input type="hidden" value="LndnbfygcqU1UDTVkHx31hc_RCpUzI9i5A7R7PKEA5Trs8UA-KzlAkoU2jNZpQ_M4MKyJAXxM4wwuJ9Dg5ymgA" data-csrf="true" class="js-data-jump-to-suggestions-path-csrf">


          </div>

        
          <div class="AppHeader-CopilotChat">
    <react-partial-anchor data-catalyst="">
      <button id="copilot-chat-header-button" data-target="react-partial-anchor.anchor" data-hotkey="Shift+C" aria-expanded="false" aria-controls="copilot-chat-panel" aria-labelledby="tooltip-791bbb70-a768-4de7-ac98-05b28a33d4e6" type="button" data-view-component="true" class="Button Button--iconOnly Button--secondary Button--medium AppHeader-button AppHeader-buttonLeft">  <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-copilot Button-visual">
    <path d="M7.998 15.035c-4.562 0-7.873-2.914-7.998-3.749V9.338c.085-.628.677-1.686 1.588-2.065.013-.07.024-.143.036-.218.029-.183.06-.384.126-.612-.201-.508-.254-1.084-.254-1.656 0-.87.128-1.769.693-2.484.579-.733 1.494-1.124 2.724-1.261 1.206-.134 2.262.034 2.944.765.05.053.096.108.139.165.044-.057.094-.112.143-.165.682-.731 1.738-.899 2.944-.765 1.23.137 2.145.528 2.724 1.261.566.715.693 1.614.693 2.484 0 .572-.053 1.148-.254 1.656.066.228.098.429.126.612.012.076.024.148.037.218.924.385 1.522 1.471 1.591 2.095v1.872c0 .766-3.351 3.795-8.002 3.795Zm0-1.485c2.28 0 4.584-1.11 5.002-1.433V7.862l-.023-.116c-.49.21-1.075.291-1.727.291-1.146 0-2.059-.327-2.71-.991A3.222 3.222 0 0 1 8 6.303a3.24 3.24 0 0 1-.544.743c-.65.664-1.563.991-2.71.991-.652 0-1.236-.081-1.727-.291l-.023.116v4.255c.419.323 2.722 1.433 5.002 1.433ZM6.762 2.83c-.193-.206-.637-.413-1.682-.297-1.019.113-1.479.404-1.713.7-.247.312-.369.789-.369 1.554 0 .793.129 1.171.308 1.371.162.181.519.379 1.442.379.853 0 1.339-.235 1.638-.54.315-.322.527-.827.617-1.553.117-.935-.037-1.395-.241-1.614Zm4.155-.297c-1.044-.116-1.488.091-1.681.297-.204.219-.359.679-.242 1.614.091.726.303 1.231.618 1.553.299.305.784.54 1.638.54.922 0 1.28-.198 1.442-.379.179-.2.308-.578.308-1.371 0-.765-.123-1.242-.37-1.554-.233-.296-.693-.587-1.713-.7Z"></path><path d="M6.25 9.037a.75.75 0 0 1 .75.75v1.501a.75.75 0 0 1-1.5 0V9.787a.75.75 0 0 1 .75-.75Zm4.25.75v1.501a.75.75 0 0 1-1.5 0V9.787a.75.75 0 0 1 1.5 0Z"></path>
</svg>
</button><tool-tip id="tooltip-791bbb70-a768-4de7-ac98-05b28a33d4e6" for="copilot-chat-header-button" popover="manual" data-direction="s" data-type="label" data-view-component="true" class="sr-only position-absolute" aria-hidden="true" role="tooltip"><template shadowrootmode="open"><style>
      :host {
        --tooltip-top: var(--tool-tip-position-top, 0);
        --tooltip-left: var(--tool-tip-position-left, 0);
        padding: var(--overlay-paddingBlock-condensed) var(--overlay-padding-condensed) !important;
        font: var(--text-body-shorthand-small);
        color: var(--tooltip-fgColor, var(--fgColor-onEmphasis)) !important;
        text-align: center;
        text-decoration: none;
        text-shadow: none;
        text-transform: none;
        letter-spacing: normal;
        word-wrap: break-word;
        white-space: pre;
        background: var(--tooltip-bgColor, var(--bgColor-emphasis)) !important;
        border-radius: var(--borderRadius-medium);
        border: 0 !important;
        opacity: 0;
        max-width: var(--overlay-width-small);
        word-wrap: break-word;
        white-space: normal;
        width: max-content !important;
        inset: var(--tooltip-top) auto auto var(--tooltip-left) !important;
        overflow: visible !important;
        text-wrap: balance;
      }

      :host(:is(.tooltip-n, .tooltip-nw, .tooltip-ne)) {
        --tooltip-top: calc(var(--tool-tip-position-top, 0) - var(--overlay-offset, 0.25rem));
        --tooltip-left: var(--tool-tip-position-left);
      }

      :host(:is(.tooltip-s, .tooltip-sw, .tooltip-se)) {
        --tooltip-top: calc(var(--tool-tip-position-top, 0) + var(--overlay-offset, 0.25rem));
        --tooltip-left: var(--tool-tip-position-left);
      }

      :host(.tooltip-w) {
        --tooltip-top: var(--tool-tip-position-top);
        --tooltip-left: calc(var(--tool-tip-position-left, 0) - var(--overlay-offset, 0.25rem));
      }

      :host(.tooltip-e) {
        --tooltip-top: var(--tool-tip-position-top);
        --tooltip-left: calc(var(--tool-tip-position-left, 0) + var(--overlay-offset, 0.25rem));
      }

      :host:after{
        position: absolute;
        display: block;
        right: 0;
        left: 0;
        height: var(--overlay-offset, 0.25rem);
        content: "";
      }

      :host(.tooltip-s):after,
      :host(.tooltip-se):after,
      :host(.tooltip-sw):after {
        bottom: 100%
      }

      :host(.tooltip-n):after,
      :host(.tooltip-ne):after,
      :host(.tooltip-nw):after {
        top: 100%;
      }

      @keyframes tooltip-appear {
        from {
          opacity: 0;
        }
        to {
          opacity: 1;
        }
      }

      :host(:popover-open),
      :host(:popover-open):before {
        animation-name: tooltip-appear;
        animation-duration: .1s;
        animation-fill-mode: forwards;
        animation-timing-function: ease-in;
      }

      :host(.\:popover-open) {
        animation-name: tooltip-appear;
        animation-duration: .1s;
        animation-fill-mode: forwards;
        animation-timing-function: ease-in;
      }

      @media (forced-colors: active) {
        :host {
          outline: solid 1px transparent;
        }

        :host:before {
          display: none;
        }
      }
    </style><slot></slot></template>Chat with Copilot</tool-tip>

      
    
        <script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_react-relay_index_js-3e4c69718bad.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_tanstack_query-core_build_modern_queryObserver_js-node_modules_tanstack_-defd52-843b41414e0e.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_micromark-util-sanitize-uri_index_js-node_modules_remark-parse_lib_index-b69642-163efad98dc5.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_remark-gfm_lib_index_js-bfb9e2c9eabe.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_react-markdown_lib_index_js-f5a9aa785eef.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_tanstack_react-query_build_modern_useQuery_js-node_modules_hast-util-fin-d142e3-4537f3f02bd7.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_github_mini-throttle_dist_decorators_js-node_modules_accname_dist_access-b37425-35bd8d94d981.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_github_combobox-nav_dist_index_js-node_modules_github_hotkey_dist_index_-2c4211-a3b6ffd98cc6.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/ui_packages_item-picker_constants_labels_ts-ui_packages_item-picker_constants_values_ts-ui_pa-163a9a-5949c2b63962.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/ui_packages_item-picker_components_RepositoryPicker_tsx-fed97f53635f.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/ui_packages_copilot-chat_utils_copilot-local-storage_ts-ui_packages_hydro-analytics_hydro-ana-74ad7c-d968edda87b9.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/ui_packages_copilot-chat_utils_copilot-chat-hooks_ts-ui_packages_issue-viewer_utils_queries_ts-57bc518f471f.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/ui_packages_test-id-props_test-id-props_ts-ui_packages_copilot-markdown_MarkdownRenderer_tsx--cd0d45-9cadf449296e.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/copilot-chat-68057c16c311.js.download"></script>
<link crossorigin="anonymous" media="all" rel="stylesheet" href="./web-technologies2025_CollegeManagementSystem_files/primer-react.2b41f48ec06f29182cb4.module.css">
<link crossorigin="anonymous" media="all" rel="stylesheet" href="./web-technologies2025_CollegeManagementSystem_files/copilot-chat.635d56a659944f1fec18.module.css">
        <link crossorigin="anonymous" media="all" rel="stylesheet" href="./web-technologies2025_CollegeManagementSystem_files/copilot-markdown-rendering-f6845e8f5d6b.css">
        <script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/primer-react-9a5713772ca5.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/react-core-af33445b6fc3.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/react-lib-f1bca44e0926.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/octicons-react-611691cca2f6.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_emotion_is-prop-valid_dist_emotion-is-prop-valid_esm_js-node_modules_emo-62da9f-2df2f32ec596.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_github_mini-throttle_dist_index_js-node_modules_stacktrace-parser_dist_s-e7dcdd-f7cc96ebae76.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_oddbird_popover-polyfill_dist_popover-fn_js-55fea94174bf.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_dompurify_dist_purify_js-b89b98661809.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_react-relay_index_js-3e4c69718bad.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_tanstack_query-core_build_modern_queryObserver_js-node_modules_tanstack_-defd52-843b41414e0e.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_micromark-util-sanitize-uri_index_js-node_modules_remark-parse_lib_index-b69642-163efad98dc5.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_remark-gfm_lib_index_js-bfb9e2c9eabe.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_react-markdown_lib_index_js-f5a9aa785eef.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_tanstack_react-query_build_modern_useQuery_js-node_modules_hast-util-fin-d142e3-4537f3f02bd7.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_github_mini-throttle_dist_decorators_js-node_modules_accname_dist_access-b37425-35bd8d94d981.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/vendors-node_modules_github_combobox-nav_dist_index_js-node_modules_github_hotkey_dist_index_-2c4211-a3b6ffd98cc6.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/ui_packages_paths_index_ts-3a2d94328e87.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/ui_packages_ui-commands_ui-commands_ts-97496b0f52ba.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/ui_packages_item-picker_constants_labels_ts-ui_packages_item-picker_constants_values_ts-ui_pa-163a9a-5949c2b63962.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/ui_packages_item-picker_components_RepositoryPicker_tsx-fed97f53635f.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/ui_packages_copilot-chat_utils_copilot-local-storage_ts-ui_packages_hydro-analytics_hydro-ana-74ad7c-d968edda87b9.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/ui_packages_copilot-chat_utils_copilot-chat-hooks_ts-ui_packages_issue-viewer_utils_queries_ts-57bc518f471f.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/ui_packages_test-id-props_test-id-props_ts-ui_packages_copilot-markdown_MarkdownRenderer_tsx--cd0d45-9cadf449296e.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/copilot-chat-68057c16c311.js.download"></script>
<link crossorigin="anonymous" media="all" rel="stylesheet" href="./web-technologies2025_CollegeManagementSystem_files/primer-react.2b41f48ec06f29182cb4.module.css">
<link crossorigin="anonymous" media="all" rel="stylesheet" href="./web-technologies2025_CollegeManagementSystem_files/copilot-chat.635d56a659944f1fec18.module.css">

<react-partial partial-name="copilot-chat" data-ssr="false" data-attempted-ssr="false" data-catalyst="" class="loaded">
  
  <script type="application/json" data-target="react-partial.embeddedData">{"props":{"currentTopic":{"id":919401293,"name":"web-technologies2025","ownerLogin":"AmirishettyAkhila","ownerType":"User","readmePath":null,"description":null,"commitOID":"9923b3982adcce1bfe4aedaffcff5f7dd2be4f75","ref":"refs/heads/main","refInfo":{"name":"main","type":"branch"},"visibility":"public","languages":[{"name":"HTML","percent":71.9},{"name":"Java","percent":28.1}],"customInstructions":null},"findFileWorkerPath":"/assets-cdn/worker/find-file-worker-9f8a877aa99f.js","renderPopover":false,"renderBetaLabel":false,"chatIsVisible":true,"chatVisibleSettingPath":"/users/Lisha-Sinha/copilot_chat/settings/copilot_chat_visibility","ssoOrganizations":[],"agentsPath":"/github-copilot/chat/agents","apiURL":"https://api.individual.githubcopilot.com","currentUserLogin":"Lisha-Sinha","customInstructions":null,"renderKnowledgeBases":false,"optedInToPreviewFeatures":false,"optedInToUserFeedback":true,"renderAttachKnowledgeBaseHerePopover":true,"renderKnowledgeBaseAttachedToChatPopover":true,"personalInstructions":null,"previewPersonalInstructions":true,"reviewLab":false,"realIp":null,"scrollToTop":false,"hasCEorCBAccess":false,"licenseType":"licensed_limited","quotas":{"limits":{"chat":500,"completions":2000},"remaining":{"chat":498,"completions":2000},"resetDate":"2025-03-20"},"icebreakers":[{"type":"functional","data":[{"id":"open-issues-in-react","message":"Get a list of the latest open issues in the facebook/react repository, including all their labels.","titleHtml":"Open issues in \u003cspan class=\"fgColor-muted\"\u003efacebook/react\u003c/span\u003e","icon":"issue-opened","color":"var(--display-green-fgColor)"},{"id":"pulls-in-vscode","message":"Retrieve pull requests in microsoft/vscode.","titleHtml":"Pull requests in \u003cspan class=\"fgColor-muted\"\u003emicrosoft/vscode\u003c/span\u003e","icon":"git-pull-request","color":"var(--display-green-fgColor)"},{"id":"commits-in-linux","message":"Show recent commits in torvalds/linux.","titleHtml":"Recent commits in \u003cspan class=\"fgColor-muted\"\u003etorvalds/linux\u003c/span\u003e","icon":"git-commit","color":"var(--display-blue-fgColor)"},{"id":"my-latest-issues","message":"Find the five latest issues assigned to me.","titleHtml":"Find issues assigned to me","icon":"issue-opened","color":"var(--display-green-fgColor)"},{"id":"latest-node-release","message":"Fetch the latest release of nodejs/node and highlight the changes.","titleHtml":"Latest \u003cspan class=\"fgColor-muted\"\u003enodejs/node\u003c/span\u003e release","icon":"tag","color":"var(--display-purple-fgColor)"},{"id":"create-profile-readme","message":"Create a profile README for $$USERNAME$$.","titleHtml":"Create a profile README for me","icon":"rocket","color":"var(--display-pink-fgColor)"},{"id":"bugs-in-primer","message":"Show recent bugs in primer/react.","titleHtml":"Recent bugs in \u003cspan class=\"fgColor-muted\"\u003eprimer/react\u003c/span\u003e","icon":"bug","color":"var(--display-red-fgColor)"},{"id":"my-open-pulls","message":"Find my open pull requests.","titleHtml":"My open pull requests","icon":"git-pull-request","color":"var(--display-green-fgColor)"},{"id":"generate-html-calculator","message":"Generate a simple calculator using HTML, CSS, and JavaScript.","titleHtml":"Generate an HTML/JS calculator","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"python-strong-password-endpoint","message":"Generate a Python endpoint for signing up that only allows strong passwords.","titleHtml":"Python password endpoint","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"rails-auth-endpoint","message":"Generate a Rails endpoint for authenticating with email and password.","titleHtml":"Rails authentication endpoint","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"python-pandas-data-analysis","message":"Write a Python script that analyzes a dataset using Pandas.","titleHtml":"Python Panda data analysis","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"explain-restful-basics","message":"Explain REST architectural principles and how to implement RESTful web services.","titleHtml":"Explain RESTful basics","icon":"book","color":"var(--display-blue-fgColor)"},{"id":"compare-http-post-vs-put","message":"Compare HTTP POST and PUT methods, explaining their proper usage in RESTful APIs.","titleHtml":"Compare HTTP POST vs PUT","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"explain-json-content-types","message":"Explain proper JSON MIME types and content-type headers for different scenarios and platforms.","titleHtml":"Explain JSON content types","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"compare-dates-and-times","message":"Explain strategies for accurately comparing dates and times across different timezones and formats.","titleHtml":"Compare dates and times","icon":"clock","color":"var(--display-blue-fgColor)"},{"id":"compare-json-comment-options","message":"Explain JSON syntax limitations regarding comments and alternative approaches for documentation.","titleHtml":"Compare JSON comment options","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"explain-stack-and-heap-memory","message":"Compare stack and heap memory allocation, their characteristics, and use cases in programming.","titleHtml":"Explain stack and heap memory","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"compare-api-version-strategies","message":"Explain different approaches to API versioning including URL, header, and content negotiation.","titleHtml":"Compare API version strategies","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"how-to-fix-git-submodules","message":"Troubleshoot and resolve issues with uninitialized Git submodules, explaining initialization commands and common pitfalls.","titleHtml":"How to fix Git submodules","icon":"git-merge","color":"var(--display-green-fgColor)"},{"id":"compare-git-fork-and-clone","message":"Compare and contrast Git clones versus forks, explaining their technical differences, use cases, and relationship to original repositories.","titleHtml":"Compare Git fork and clone","icon":"git-branch","color":"var(--display-green-fgColor)"},{"id":"explain-pull-request-basics","message":"Walk through the complete process of creating, submitting, and managing pull requests on GitHub, from forking to merging.","titleHtml":"Explain pull request basics","icon":"git-pull-request","color":"var(--display-green-fgColor)"},{"id":"git-history-cleanup-guide","message":"Provide a complete guide to permanently removing files from Git history, including BFG and filter-repo approaches with safety considerations.","titleHtml":"Git history cleanup guide","icon":"trash","color":"var(--display-red-fgColor)"},{"id":"git-credential-management","message":"Explain the different methods for caching HTTPS credentials when pushing Git commits, including credential helpers, personal access tokens, and their security implications.","titleHtml":"Git credential management","icon":"key","color":"var(--display-purple-fgColor)"},{"id":"compare-origin-and-upstream","message":"Explain the conceptual and functional differences between origin and upstream remote repositories in Git, with examples of how they're used in workflow.","titleHtml":"Compare origin and upstream","icon":"git-branch","color":"var(--display-green-fgColor)"},{"id":"how-to-download-github-folders","message":"Describe various methods to download specific folders from GitHub repositories without cloning the entire project.","titleHtml":"How to download GitHub folders","icon":"download","color":"var(--display-blue-fgColor)"},{"id":"git-path-configurations","message":"Provide cross-platform instructions for properly configuring GitHub Desktop to include Git in the system PATH, enabling command-line Git operations alongside the GUI client on Windows, macOS, and Linux systems.","titleHtml":"Git PATH configurations","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"explain-fork-sync-process","message":"Provide step-by-step instructions for synchronizing a forked GitHub repository with its original upstream repository, including both command line methods and GitHub interface options.","titleHtml":"Explain fork sync process","icon":"git-merge","color":"var(--display-green-fgColor)"},{"id":"list-git-history-danger-zones","message":"List and explain potentially dangerous Git commands that can alter repository history, with guidelines on when and how to use them safely.","titleHtml":"List Git history danger zones","icon":"alert","color":"var(--display-red-fgColor)"},{"id":"explain-cli-repository-setup","message":"Explain methods for creating GitHub repositories entirely from the command line using GitHub CLI, API tokens, and other headless approaches.","titleHtml":"Explain CLI repository setup","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"how-to-migrate-git-remote","message":"Detail the process of migrating an existing Git repository to a different remote server while preserving history, branches, and tags, with command examples.","titleHtml":"How to migrate Git remote","icon":"git-commit","color":"var(--display-blue-fgColor)"},{"id":"compare-git-and-github","message":"Explain the fundamental differences between Git (the distributed version control system) and GitHub (the web-based hosting service), clarifying their relationship, unique features, and how they complement each other in modern development workflows.","titleHtml":"Compare Git and GitHub","icon":"git-branch","color":"var(--display-green-fgColor)"},{"id":"learn-git-multi-remote-setup","message":"Explain the process of configuring a Git repository to push commits simultaneously to multiple remote repositories, including setting up multiple remotes and creating automated push workflows.","titleHtml":"Learn Git multi remote setup","icon":"git-commit","color":"var(--display-blue-fgColor)"},{"id":"convert-single-branch-clone","message":"Explain methods for converting a single-branch Git clone into a full repository clone with access to all remote branches, including fetch commands and configuration changes.","titleHtml":"Convert single branch clone","icon":"git-branch","color":"var(--display-green-fgColor)"},{"id":"multiple-github-account-guide","message":"Provide step-by-step instructions for configuring and managing multiple GitHub accounts on a single computer, including SSH key setup and Git configuration.","titleHtml":"Multiple GitHub account guide","icon":"mark-github","color":"var(--display-purple-fgColor)"},{"id":"explore-java-map-iterations","message":"Compare different methods for efficiently iterating over Map entries in Java.","titleHtml":"Explore Java Map Iterations","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"understand-java-access-levels","message":"Explain differences between Java's access modifiers with practical examples.","titleHtml":"Understand Java access levels","icon":"lock","color":"var(--display-purple-fgColor)"},{"id":"compare-java-password-types","message":"Compare char[] vs String for password storage in Java with security implications.","titleHtml":"Compare Java password types","icon":"key","color":"var(--display-purple-fgColor)"},{"id":"compare-java-hashmap-hashtable","message":"Compare HashMap and Hashtable in Java, explaining their key differences including thread safety, null handling, synchronization overhead, and performance characteristics with practical examples.","titleHtml":"Compare Java HashMap/Hashtable","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"learn-java-array-sorting-perf","message":"Explain how CPU branch prediction and cache optimization affect Java array processing performance, demonstrating the speed difference between sorted and unsorted arrays with examples.","titleHtml":"Learn Java array sorting perf","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"java-operator-casting-basics","message":"Explain why compound assignment operators in Java don't require explicit casting.","titleHtml":"Java operator casting basics","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"explain-java-char-for-password","message":"Explain why char[] is preferred over String for passwords in Java, including security implications.","titleHtml":"Explain Java char[] for password","icon":"key","color":"var(--display-purple-fgColor)"},{"id":"compare-java-pass-by-value-ref","message":"Explain whether Java is pass-by-reference or pass-by-value with examples.","titleHtml":"Compare Java pass by value/ref","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"learn-js-import-patterns","message":"Explain different approaches to importing JavaScript files, including modern ES6 modules.","titleHtml":"Learn JS import patterns","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"explore-js-array-loops","message":"Compare different methods for iterating over arrays in JavaScript with use cases.","titleHtml":"Explore JS array loops","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"understand-js-strict-mode-usage","message":"Explain the purpose and benefits of strict mode in JavaScript, including common pitfalls it prevents.","titleHtml":"Understand JS strict mode usage","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"learn-js-closures","message":"Explain JavaScript closure concept with practical examples showing scope and data privacy.","titleHtml":"Learn JS closures","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"compare-js-equality-operators","message":"Compare the behavior and use cases of == and === operators in JavaScript, explaining type coercion and best practices.","titleHtml":"Compare JS equality operators","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"learn-js-sleep-function","message":"Explain how to implement delay/sleep functionality in JavaScript using promises and async/await.","titleHtml":"Learn JS sleep function","icon":"clock","color":"var(--display-blue-fgColor)"},{"id":"compare-js-substring-checks","message":"Compare methods for checking substrings in JavaScript strings, with performance considerations.","titleHtml":"Compare JS substring checks","icon":"search","color":"var(--display-blue-fgColor)"},{"id":"how-to-handle-js-async-response","message":"Explain handling asynchronous operations in JavaScript using promises, async/await, and callbacks.","titleHtml":"How to handle JS async response","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"python-slice-syntax","message":"Explain Python's list slicing syntax, including step values and negative indices.","titleHtml":"Python slice syntax","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"how-to-flatten-lists-in-python","message":"Compare methods for flattening nested lists in Python, from simple to complex cases.","titleHtml":"How to flatten lists in Python","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"learn-python-main-check","message":"Explain the purpose and usage of if name == \"main\" in Python, including module behavior and best practices.","titleHtml":"Learn Python main check","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"python-env-variables-guide","message":"Explain how to access and manage environment variables in Python applications.","titleHtml":"Python env variables guide","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"learn-python-star-operators","message":"Explain the difference between single and double asterisk operators in Python for parameter packing and unpacking.","titleHtml":"Learn Python star operators","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"explain-python-yield","message":"Explain Python generators and the yield keyword with examples of memory-efficient iteration.","titleHtml":"Explain Python yield","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"python-variable-passing-guide","message":"Explain Python's pass-by-object-reference behavior with examples of mutable and immutable objects.","titleHtml":"Python variable passing guide","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"compare-python-method-decorators","message":"Compare @staticmethod and @classmethod decorators in Python, explaining their use cases.","titleHtml":"Compare Python method decorators","icon":"code","color":"var(--display-gray-fgColor)"}]},{"type":"instructional","data":[{"id":"what-can-i-do-with-github-copilot-chat","message":"What can I do with GitHub Copilot Chat?","titleHtml":"What can I do here?","icon":"light-bulb","color":"var(--display-purple-fgColor)"}]},{"type":"interactional","data":[{"id":"to-do-app-local-storage","message":"Create a to-do list application with local storage functionality.","titleHtml":"To-do list with local storage","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"digital-clock-time-zones","message":"Create a digital clock that displays the current time in different time zones.","titleHtml":"A digital time zone clock","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"weather-dashboard-app","message":"Develop a weather dashboard that fetches data from a public weather API.","titleHtml":"Develop a weather dashboard","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"create-joke-generator","message":"Create a random joke generator using an external API.","titleHtml":"Create a joke generator","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"generate-curl-json-post","message":"Demonstrate how to send JSON data using cURL, including headers and authentication.","titleHtml":"Generate cURL JSON POST","icon":"terminal","color":"var(--display-gray-fgColor)"},{"id":"show-linux-text-search","message":"Demonstrate commands and techniques for searching text within files on Linux systems.","titleHtml":"Show Linux text search","icon":"search","color":"var(--display-blue-fgColor)"},{"id":"learn-to-check-visibility-in-js","message":"Demonstrate methods for detecting hidden elements in JavaScript, including various visibility states.","titleHtml":"Learn to check visibility in JS","icon":"eye","color":"var(--display-purple-fgColor)"},{"id":"find-bash-script-location","message":"Show methods for determining a Bash script's directory location during execution.","titleHtml":"Find Bash script location","icon":"terminal","color":"var(--display-gray-fgColor)"},{"id":"explain-special-char-escape","message":"Demonstrate different methods for escaping special characters in various programming contexts.","titleHtml":"Explain special char escape","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"show-directory-exists","message":"Show different methods for checking directory existence in Bash with error handling.","titleHtml":"Show directory exists","icon":"terminal","color":"var(--display-gray-fgColor)"},{"id":"webpage-redirect-methods","message":"Show different techniques for implementing webpage redirects using HTML, JavaScript and server-side approaches.","titleHtml":"Webpage redirect methods","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"branch-sync-patterns","message":"Demonstrate Git commands for synchronizing branches, including reset, rebase, and merge techniques with their implications.","titleHtml":"Branch sync patterns","icon":"git-merge","color":"var(--display-green-fgColor)"},{"id":"how-to-recover-deleted-git-files","message":"Demonstrate techniques for locating and recovering files that were deleted in previous commits, including Git log commands, filtering options, and restoration methods.","titleHtml":"How to recover deleted Git files","icon":"history","color":"var(--display-blue-fgColor)"},{"id":"how-to-load-remote-js-script","message":"Provide code examples and best practices for linking to and executing JavaScript files hosted on GitHub in web applications.","titleHtml":"How to load remote JS script","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"how-to-npm-install-from-github","message":"Demonstrate different methods for installing npm packages directly from GitHub repositories, including syntax examples and troubleshooting tips.","titleHtml":"How to npm install from GitHub","icon":"package","color":"var(--display-blue-fgColor)"},{"id":"demo-java-linkedlist-arraylist","message":"Show different methods for initializing ArrayLists in Java in a single line.","titleHtml":"Demo Java LinkedList/ArrayList","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"learn-java-memory-issues","message":"Demonstrate common causes of memory leaks in Java and how to prevent them.","titleHtml":"Learn Java memory issues","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"learn-java-stream-conversion","message":"Show different methods for converting an InputStream to a String in Java, comparing performance.","titleHtml":"Learn Java stream conversion","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"java-null-handling-patterns","message":"Demonstrate best practices for handling null values in Java using Optional and other patterns.","titleHtml":"Java null handling patterns","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"java-list-conversion-guide","message":"Show different approaches to convert arrays to ArrayLists in Java with examples.","titleHtml":"Java List conversion guide","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"js-email-validation-guide","message":"Demonstrate robust email validation techniques in JavaScript, from regex patterns to validation APIs.","titleHtml":"JS email validation guide","icon":"mail","color":"var(--display-blue-fgColor)"},{"id":"prototype-js-array-iteration","message":"Demonstrate methods for removing specific items from JavaScript arrays with examples.","titleHtml":"Prototype JS array iteration","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"explore-js-object-checks","message":"Show different methods for detecting empty objects in JavaScript, considering various edge cases.","titleHtml":"Explore JS object checks","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"how-to-js-remove-object-props","message":"Demonstrate different methods for removing properties from JavaScript objects and their implications.","titleHtml":"How to JS remove object props","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"how-to-merge-python-dicts","message":"Show different methods for merging Python dictionaries, including dictionary unpacking and update methods.","titleHtml":"How to merge Python dicts","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"explore-python-ternary-syntax","message":"Demonstrate Python's ternary conditional operator with examples comparing it to traditional if-else statements.","titleHtml":"Explore Python ternary syntax","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"demo-python-loop-with-index","message":"Demonstrate different ways to access index values in Python for loops using enumerate and range.","titleHtml":"Demo Python loop with index","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"demo-sorting-python-dictionary","message":"Demonstrate methods for sorting Python dictionaries by values using different approaches and sorting criteria.","titleHtml":"Demo sorting Python dictionary","icon":"code","color":"var(--display-gray-fgColor)"},{"id":"learn-python-file-checks","message":"Show methods for checking file existence in Python without raising exceptions.","titleHtml":"Learn Python file checks","icon":"file","color":"var(--display-blue-fgColor)"},{"id":"demo-python-run-system-command","message":"Demonstrate various methods for executing system commands in Python using subprocess and other modules.","titleHtml":"Demo Python run system command","icon":"terminal","color":"var(--display-gray-fgColor)"}]}],"canShareThread":true}}</script>
  <div data-target="react-partial.reactRoot"><div class="Box-sc-g0xbh4-0 bpDFns"></div><div class="Box-sc-g0xbh4-0 hmHhrt"></div><script type="application/json" id="__PRIMER_DATA_:r4v:__">{"resolvedServerColorMode":"day"}</script></div>
</react-partial>


      </react-partial-anchor>
    <react-partial-anchor data-catalyst="">
      <button id="global-copilot-menu-button" data-target="react-partial-anchor.anchor" aria-expanded="false" aria-labelledby="tooltip-828e3239-7522-45da-9d26-bc31324f04c7" type="button" data-view-component="true" class="Button Button--iconOnly Button--secondary Button--medium AppHeader-button AppHeader-buttonRight" aria-haspopup="true">  <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-triangle-down Button-visual">
    <path d="m4.427 7.427 3.396 3.396a.25.25 0 0 0 .354 0l3.396-3.396A.25.25 0 0 0 11.396 7H4.604a.25.25 0 0 0-.177.427Z"></path>
</svg>
</button><tool-tip id="tooltip-828e3239-7522-45da-9d26-bc31324f04c7" for="global-copilot-menu-button" popover="manual" data-direction="s" data-type="label" data-view-component="true" class="sr-only position-absolute" aria-hidden="true" role="tooltip"><template shadowrootmode="open"><style>
      :host {
        --tooltip-top: var(--tool-tip-position-top, 0);
        --tooltip-left: var(--tool-tip-position-left, 0);
        padding: var(--overlay-paddingBlock-condensed) var(--overlay-padding-condensed) !important;
        font: var(--text-body-shorthand-small);
        color: var(--tooltip-fgColor, var(--fgColor-onEmphasis)) !important;
        text-align: center;
        text-decoration: none;
        text-shadow: none;
        text-transform: none;
        letter-spacing: normal;
        word-wrap: break-word;
        white-space: pre;
        background: var(--tooltip-bgColor, var(--bgColor-emphasis)) !important;
        border-radius: var(--borderRadius-medium);
        border: 0 !important;
        opacity: 0;
        max-width: var(--overlay-width-small);
        word-wrap: break-word;
        white-space: normal;
        width: max-content !important;
        inset: var(--tooltip-top) auto auto var(--tooltip-left) !important;
        overflow: visible !important;
        text-wrap: balance;
      }

      :host(:is(.tooltip-n, .tooltip-nw, .tooltip-ne)) {
        --tooltip-top: calc(var(--tool-tip-position-top, 0) - var(--overlay-offset, 0.25rem));
        --tooltip-left: var(--tool-tip-position-left);
      }

      :host(:is(.tooltip-s, .tooltip-sw, .tooltip-se)) {
        --tooltip-top: calc(var(--tool-tip-position-top, 0) + var(--overlay-offset, 0.25rem));
        --tooltip-left: var(--tool-tip-position-left);
      }

      :host(.tooltip-w) {
        --tooltip-top: var(--tool-tip-position-top);
        --tooltip-left: calc(var(--tool-tip-position-left, 0) - var(--overlay-offset, 0.25rem));
      }

      :host(.tooltip-e) {
        --tooltip-top: var(--tool-tip-position-top);
        --tooltip-left: calc(var(--tool-tip-position-left, 0) + var(--overlay-offset, 0.25rem));
      }

      :host:after{
        position: absolute;
        display: block;
        right: 0;
        left: 0;
        height: var(--overlay-offset, 0.25rem);
        content: "";
      }

      :host(.tooltip-s):after,
      :host(.tooltip-se):after,
      :host(.tooltip-sw):after {
        bottom: 100%
      }

      :host(.tooltip-n):after,
      :host(.tooltip-ne):after,
      :host(.tooltip-nw):after {
        top: 100%;
      }

      @keyframes tooltip-appear {
        from {
          opacity: 0;
        }
        to {
          opacity: 1;
        }
      }

      :host(:popover-open),
      :host(:popover-open):before {
        animation-name: tooltip-appear;
        animation-duration: .1s;
        animation-fill-mode: forwards;
        animation-timing-function: ease-in;
      }

      :host(.\:popover-open) {
        animation-name: tooltip-appear;
        animation-duration: .1s;
        animation-fill-mode: forwards;
        animation-timing-function: ease-in;
      }

      @media (forced-colors: active) {
        :host {
          outline: solid 1px transparent;
        }

        :host:before {
          display: none;
        }
      }
    </style><slot></slot></template>Open Copilot…</tool-tip>

      
    
        <script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/global-copilot-menu-1bb0a193e6c0.js.download"></script>
<link crossorigin="anonymous" media="all" rel="stylesheet" href="./web-technologies2025_CollegeManagementSystem_files/primer-react.2b41f48ec06f29182cb4.module.css">

<react-partial partial-name="global-copilot-menu" data-ssr="false" data-attempted-ssr="false" data-catalyst="" class="loaded">
  
  <script type="application/json" data-target="react-partial.embeddedData">{"props":{}}</script>
  <div data-target="react-partial.reactRoot"><script type="application/json" id="__PRIMER_DATA_:r4n:__">{"resolvedServerColorMode":"day"}</script></div>
</react-partial>

      </react-partial-anchor>
</div>


        <div class="AppHeader-actions position-relative">
             <react-partial-anchor data-catalyst="">
      <button id="global-create-menu-anchor" aria-label="Create something new" data-target="react-partial-anchor.anchor" type="button" data-view-component="true" class="AppHeader-button global-create-button Button--secondary Button--medium Button width-auto color-fg-muted" aria-describedby="tooltip-01f4afd1-7710-4681-a9d5-467a59dcbb25" aria-expanded="false" aria-haspopup="true">  <span class="Button-content">
      <span class="Button-visual Button-leadingVisual">
        <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-plus">
    <path d="M7.75 2a.75.75 0 0 1 .75.75V7h4.25a.75.75 0 0 1 0 1.5H8.5v4.25a.75.75 0 0 1-1.5 0V8.5H2.75a.75.75 0 0 1 0-1.5H7V2.75A.75.75 0 0 1 7.75 2Z"></path>
</svg>
      </span>
    <span class="Button-label"><svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-triangle-down">
    <path d="m4.427 7.427 3.396 3.396a.25.25 0 0 0 .354 0l3.396-3.396A.25.25 0 0 0 11.396 7H4.604a.25.25 0 0 0-.177.427Z"></path>
</svg></span>
  </span>
</button><tool-tip id="tooltip-01f4afd1-7710-4681-a9d5-467a59dcbb25" for="global-create-menu-anchor" popover="manual" data-direction="s" data-type="description" data-view-component="true" class="sr-only position-absolute" role="tooltip"><template shadowrootmode="open"><style>
      :host {
        --tooltip-top: var(--tool-tip-position-top, 0);
        --tooltip-left: var(--tool-tip-position-left, 0);
        padding: var(--overlay-paddingBlock-condensed) var(--overlay-padding-condensed) !important;
        font: var(--text-body-shorthand-small);
        color: var(--tooltip-fgColor, var(--fgColor-onEmphasis)) !important;
        text-align: center;
        text-decoration: none;
        text-shadow: none;
        text-transform: none;
        letter-spacing: normal;
        word-wrap: break-word;
        white-space: pre;
        background: var(--tooltip-bgColor, var(--bgColor-emphasis)) !important;
        border-radius: var(--borderRadius-medium);
        border: 0 !important;
        opacity: 0;
        max-width: var(--overlay-width-small);
        word-wrap: break-word;
        white-space: normal;
        width: max-content !important;
        inset: var(--tooltip-top) auto auto var(--tooltip-left) !important;
        overflow: visible !important;
        text-wrap: balance;
      }

      :host(:is(.tooltip-n, .tooltip-nw, .tooltip-ne)) {
        --tooltip-top: calc(var(--tool-tip-position-top, 0) - var(--overlay-offset, 0.25rem));
        --tooltip-left: var(--tool-tip-position-left);
      }

      :host(:is(.tooltip-s, .tooltip-sw, .tooltip-se)) {
        --tooltip-top: calc(var(--tool-tip-position-top, 0) + var(--overlay-offset, 0.25rem));
        --tooltip-left: var(--tool-tip-position-left);
      }

      :host(.tooltip-w) {
        --tooltip-top: var(--tool-tip-position-top);
        --tooltip-left: calc(var(--tool-tip-position-left, 0) - var(--overlay-offset, 0.25rem));
      }

      :host(.tooltip-e) {
        --tooltip-top: var(--tool-tip-position-top);
        --tooltip-left: calc(var(--tool-tip-position-left, 0) + var(--overlay-offset, 0.25rem));
      }

      :host:after{
        position: absolute;
        display: block;
        right: 0;
        left: 0;
        height: var(--overlay-offset, 0.25rem);
        content: "";
      }

      :host(.tooltip-s):after,
      :host(.tooltip-se):after,
      :host(.tooltip-sw):after {
        bottom: 100%
      }

      :host(.tooltip-n):after,
      :host(.tooltip-ne):after,
      :host(.tooltip-nw):after {
        top: 100%;
      }

      @keyframes tooltip-appear {
        from {
          opacity: 0;
        }
        to {
          opacity: 1;
        }
      }

      :host(:popover-open),
      :host(:popover-open):before {
        animation-name: tooltip-appear;
        animation-duration: .1s;
        animation-fill-mode: forwards;
        animation-timing-function: ease-in;
      }

      :host(.\:popover-open) {
        animation-name: tooltip-appear;
        animation-duration: .1s;
        animation-fill-mode: forwards;
        animation-timing-function: ease-in;
      }

      @media (forced-colors: active) {
        :host {
          outline: solid 1px transparent;
        }

        :host:before {
          display: none;
        }
      }
    </style><slot></slot></template>Create new...</tool-tip>

      
    
        <script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/ui_packages_promise-with-resolvers-polyfill_promise-with-resolvers-polyfill_ts-ui_packages_re-8d43b0-a3dbd4feb65d.js.download"></script>
<script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/global-create-menu-7510a0ee7657.js.download"></script>
<link crossorigin="anonymous" media="all" rel="stylesheet" href="./web-technologies2025_CollegeManagementSystem_files/primer-react.2b41f48ec06f29182cb4.module.css">

<react-partial partial-name="global-create-menu" data-ssr="false" data-attempted-ssr="false" data-catalyst="" class="loaded">
  
  <script type="application/json" data-target="react-partial.embeddedData">{"props":{"createRepo":true,"importRepo":true,"codespaces":true,"gist":true,"createOrg":true,"createProject":false,"createProjectUrl":"/Lisha-Sinha?tab=projects","createLegacyProject":false,"createIssue":false,"org":null,"owner":"AmirishettyAkhila","repo":"web-technologies2025"}}</script>
  <div data-target="react-partial.reactRoot"><script type="application/json" id="__PRIMER_DATA_:r4q:__">{"resolvedServerColorMode":"day"}</script></div>
</react-partial>

      </react-partial-anchor>


          <a href="https://github.com/issues" data-analytics-event="{&quot;category&quot;:&quot;Global navigation&quot;,&quot;action&quot;:&quot;ISSUES_HEADER&quot;,&quot;label&quot;:null}" id="icon-button-e75315f8-ba67-4747-8b21-d7c6966eb78d" aria-labelledby="tooltip-a5b16fff-0740-440e-91f0-c4467904af2c" data-view-component="true" class="Button Button--iconOnly Button--secondary Button--medium AppHeader-button color-fg-muted">  <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-issue-opened Button-visual">
    <path d="M8 9.5a1.5 1.5 0 1 0 0-3 1.5 1.5 0 0 0 0 3Z"></path><path d="M8 0a8 8 0 1 1 0 16A8 8 0 0 1 8 0ZM1.5 8a6.5 6.5 0 1 0 13 0 6.5 6.5 0 0 0-13 0Z"></path>
</svg>
</a><tool-tip id="tooltip-a5b16fff-0740-440e-91f0-c4467904af2c" for="icon-button-e75315f8-ba67-4747-8b21-d7c6966eb78d" popover="manual" data-direction="s" data-type="label" data-view-component="true" class="sr-only position-absolute" aria-hidden="true" role="tooltip"><template shadowrootmode="open"><style>
      :host {
        --tooltip-top: var(--tool-tip-position-top, 0);
        --tooltip-left: var(--tool-tip-position-left, 0);
        padding: var(--overlay-paddingBlock-condensed) var(--overlay-padding-condensed) !important;
        font: var(--text-body-shorthand-small);
        color: var(--tooltip-fgColor, var(--fgColor-onEmphasis)) !important;
        text-align: center;
        text-decoration: none;
        text-shadow: none;
        text-transform: none;
        letter-spacing: normal;
        word-wrap: break-word;
        white-space: pre;
        background: var(--tooltip-bgColor, var(--bgColor-emphasis)) !important;
        border-radius: var(--borderRadius-medium);
        border: 0 !important;
        opacity: 0;
        max-width: var(--overlay-width-small);
        word-wrap: break-word;
        white-space: normal;
        width: max-content !important;
        inset: var(--tooltip-top) auto auto var(--tooltip-left) !important;
        overflow: visible !important;
        text-wrap: balance;
      }

      :host(:is(.tooltip-n, .tooltip-nw, .tooltip-ne)) {
        --tooltip-top: calc(var(--tool-tip-position-top, 0) - var(--overlay-offset, 0.25rem));
        --tooltip-left: var(--tool-tip-position-left);
      }

      :host(:is(.tooltip-s, .tooltip-sw, .tooltip-se)) {
        --tooltip-top: calc(var(--tool-tip-position-top, 0) + var(--overlay-offset, 0.25rem));
        --tooltip-left: var(--tool-tip-position-left);
      }

      :host(.tooltip-w) {
        --tooltip-top: var(--tool-tip-position-top);
        --tooltip-left: calc(var(--tool-tip-position-left, 0) - var(--overlay-offset, 0.25rem));
      }

      :host(.tooltip-e) {
        --tooltip-top: var(--tool-tip-position-top);
        --tooltip-left: calc(var(--tool-tip-position-left, 0) + var(--overlay-offset, 0.25rem));
      }

      :host:after{
        position: absolute;
        display: block;
        right: 0;
        left: 0;
        height: var(--overlay-offset, 0.25rem);
        content: "";
      }

      :host(.tooltip-s):after,
      :host(.tooltip-se):after,
      :host(.tooltip-sw):after {
        bottom: 100%
      }

      :host(.tooltip-n):after,
      :host(.tooltip-ne):after,
      :host(.tooltip-nw):after {
        top: 100%;
      }

      @keyframes tooltip-appear {
        from {
          opacity: 0;
        }
        to {
          opacity: 1;
        }
      }

      :host(:popover-open),
      :host(:popover-open):before {
        animation-name: tooltip-appear;
        animation-duration: .1s;
        animation-fill-mode: forwards;
        animation-timing-function: ease-in;
      }

      :host(.\:popover-open) {
        animation-name: tooltip-appear;
        animation-duration: .1s;
        animation-fill-mode: forwards;
        animation-timing-function: ease-in;
      }

      @media (forced-colors: active) {
        :host {
          outline: solid 1px transparent;
        }

        :host:before {
          display: none;
        }
      }
    </style><slot></slot></template>Your issues</tool-tip>

          <a href="https://github.com/pulls" data-analytics-event="{&quot;category&quot;:&quot;Global navigation&quot;,&quot;action&quot;:&quot;PULL_REQUESTS_HEADER&quot;,&quot;label&quot;:null}" id="icon-button-59fc3470-3fa6-46e1-b4f6-b90ab9bd4ed2" aria-labelledby="tooltip-955ee0b4-43ee-413b-a078-afbf23d8bfdb" data-view-component="true" class="Button Button--iconOnly Button--secondary Button--medium AppHeader-button color-fg-muted">  <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-git-pull-request Button-visual">
    <path d="M1.5 3.25a2.25 2.25 0 1 1 3 2.122v5.256a2.251 2.251 0 1 1-1.5 0V5.372A2.25 2.25 0 0 1 1.5 3.25Zm5.677-.177L9.573.677A.25.25 0 0 1 10 .854V2.5h1A2.5 2.5 0 0 1 13.5 5v5.628a2.251 2.251 0 1 1-1.5 0V5a1 1 0 0 0-1-1h-1v1.646a.25.25 0 0 1-.427.177L7.177 3.427a.25.25 0 0 1 0-.354ZM3.75 2.5a.75.75 0 1 0 0 1.5.75.75 0 0 0 0-1.5Zm0 9.5a.75.75 0 1 0 0 1.5.75.75 0 0 0 0-1.5Zm8.25.75a.75.75 0 1 0 1.5 0 .75.75 0 0 0-1.5 0Z"></path>
</svg>
</a><tool-tip id="tooltip-955ee0b4-43ee-413b-a078-afbf23d8bfdb" for="icon-button-59fc3470-3fa6-46e1-b4f6-b90ab9bd4ed2" popover="manual" data-direction="s" data-type="label" data-view-component="true" class="sr-only position-absolute" aria-hidden="true" role="tooltip"><template shadowrootmode="open"><style>
      :host {
        --tooltip-top: var(--tool-tip-position-top, 0);
        --tooltip-left: var(--tool-tip-position-left, 0);
        padding: var(--overlay-paddingBlock-condensed) var(--overlay-padding-condensed) !important;
        font: var(--text-body-shorthand-small);
        color: var(--tooltip-fgColor, var(--fgColor-onEmphasis)) !important;
        text-align: center;
        text-decoration: none;
        text-shadow: none;
        text-transform: none;
        letter-spacing: normal;
        word-wrap: break-word;
        white-space: pre;
        background: var(--tooltip-bgColor, var(--bgColor-emphasis)) !important;
        border-radius: var(--borderRadius-medium);
        border: 0 !important;
        opacity: 0;
        max-width: var(--overlay-width-small);
        word-wrap: break-word;
        white-space: normal;
        width: max-content !important;
        inset: var(--tooltip-top) auto auto var(--tooltip-left) !important;
        overflow: visible !important;
        text-wrap: balance;
      }

      :host(:is(.tooltip-n, .tooltip-nw, .tooltip-ne)) {
        --tooltip-top: calc(var(--tool-tip-position-top, 0) - var(--overlay-offset, 0.25rem));
        --tooltip-left: var(--tool-tip-position-left);
      }

      :host(:is(.tooltip-s, .tooltip-sw, .tooltip-se)) {
        --tooltip-top: calc(var(--tool-tip-position-top, 0) + var(--overlay-offset, 0.25rem));
        --tooltip-left: var(--tool-tip-position-left);
      }

      :host(.tooltip-w) {
        --tooltip-top: var(--tool-tip-position-top);
        --tooltip-left: calc(var(--tool-tip-position-left, 0) - var(--overlay-offset, 0.25rem));
      }

      :host(.tooltip-e) {
        --tooltip-top: var(--tool-tip-position-top);
        --tooltip-left: calc(var(--tool-tip-position-left, 0) + var(--overlay-offset, 0.25rem));
      }

      :host:after{
        position: absolute;
        display: block;
        right: 0;
        left: 0;
        height: var(--overlay-offset, 0.25rem);
        content: "";
      }

      :host(.tooltip-s):after,
      :host(.tooltip-se):after,
      :host(.tooltip-sw):after {
        bottom: 100%
      }

      :host(.tooltip-n):after,
      :host(.tooltip-ne):after,
      :host(.tooltip-nw):after {
        top: 100%;
      }

      @keyframes tooltip-appear {
        from {
          opacity: 0;
        }
        to {
          opacity: 1;
        }
      }

      :host(:popover-open),
      :host(:popover-open):before {
        animation-name: tooltip-appear;
        animation-duration: .1s;
        animation-fill-mode: forwards;
        animation-timing-function: ease-in;
      }

      :host(.\:popover-open) {
        animation-name: tooltip-appear;
        animation-duration: .1s;
        animation-fill-mode: forwards;
        animation-timing-function: ease-in;
      }

      @media (forced-colors: active) {
        :host {
          outline: solid 1px transparent;
        }

        :host:before {
          display: none;
        }
      }
    </style><slot></slot></template>Your pull requests</tool-tip>

        </div>

        <notification-indicator data-channel="eyJjIjoibm90aWZpY2F0aW9uLWNoYW5nZWQ6MTg1OTUxMTA5IiwidCI6MTc0MDUwMTI5OX0=--001aa5067538832b0a43a8e3c5d508c2be02df5a0879a0d46ccec8cc59ed9537" data-indicator-mode="none" data-tooltip-global="You have unread notifications" data-tooltip-unavailable="Notifications are unavailable at the moment." data-tooltip-none="You have no unread notifications" data-header-redesign-enabled="true" data-fetch-indicator-src="/notifications/indicator" data-fetch-indicator-enabled="true" data-view-component="true" class="js-socket-channel" data-fetch-retry-delay-time="500" data-catalyst="">
    <a id="AppHeader-notifications-button" href="https://github.com/notifications" aria-labelledby="notification-indicator-tooltip" data-hotkey="g n" data-target="notification-indicator.link" data-analytics-event="{&quot;category&quot;:&quot;Global navigation&quot;,&quot;action&quot;:&quot;NOTIFICATIONS_HEADER&quot;,&quot;label&quot;:&quot;icon:read&quot;}" data-view-component="true" class="Button Button--iconOnly Button--secondary Button--medium AppHeader-button color-fg-muted">  <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-inbox Button-visual">
    <path d="M2.8 2.06A1.75 1.75 0 0 1 4.41 1h7.18c.7 0 1.333.417 1.61 1.06l2.74 6.395c.04.093.06.194.06.295v4.5A1.75 1.75 0 0 1 14.25 15H1.75A1.75 1.75 0 0 1 0 13.25v-4.5c0-.101.02-.202.06-.295Zm1.61.44a.25.25 0 0 0-.23.152L1.887 8H4.75a.75.75 0 0 1 .6.3L6.625 10h2.75l1.275-1.7a.75.75 0 0 1 .6-.3h2.863L11.82 2.652a.25.25 0 0 0-.23-.152Zm10.09 7h-2.875l-1.275 1.7a.75.75 0 0 1-.6.3h-3.5a.75.75 0 0 1-.6-.3L4.375 9.5H1.5v3.75c0 .138.112.25.25.25h12.5a.25.25 0 0 0 .25-.25Z"></path>
</svg>
</a>

    <tool-tip id="notification-indicator-tooltip" data-target="notification-indicator.tooltip" for="AppHeader-notifications-button" popover="manual" data-direction="s" data-type="label" data-view-component="true" class="sr-only position-absolute" aria-hidden="true" role="tooltip"><template shadowrootmode="open"><style>
      :host {
        --tooltip-top: var(--tool-tip-position-top, 0);
        --tooltip-left: var(--tool-tip-position-left, 0);
        padding: var(--overlay-paddingBlock-condensed) var(--overlay-padding-condensed) !important;
        font: var(--text-body-shorthand-small);
        color: var(--tooltip-fgColor, var(--fgColor-onEmphasis)) !important;
        text-align: center;
        text-decoration: none;
        text-shadow: none;
        text-transform: none;
        letter-spacing: normal;
        word-wrap: break-word;
        white-space: pre;
        background: var(--tooltip-bgColor, var(--bgColor-emphasis)) !important;
        border-radius: var(--borderRadius-medium);
        border: 0 !important;
        opacity: 0;
        max-width: var(--overlay-width-small);
        word-wrap: break-word;
        white-space: normal;
        width: max-content !important;
        inset: var(--tooltip-top) auto auto var(--tooltip-left) !important;
        overflow: visible !important;
        text-wrap: balance;
      }

      :host(:is(.tooltip-n, .tooltip-nw, .tooltip-ne)) {
        --tooltip-top: calc(var(--tool-tip-position-top, 0) - var(--overlay-offset, 0.25rem));
        --tooltip-left: var(--tool-tip-position-left);
      }

      :host(:is(.tooltip-s, .tooltip-sw, .tooltip-se)) {
        --tooltip-top: calc(var(--tool-tip-position-top, 0) + var(--overlay-offset, 0.25rem));
        --tooltip-left: var(--tool-tip-position-left);
      }

      :host(.tooltip-w) {
        --tooltip-top: var(--tool-tip-position-top);
        --tooltip-left: calc(var(--tool-tip-position-left, 0) - var(--overlay-offset, 0.25rem));
      }

      :host(.tooltip-e) {
        --tooltip-top: var(--tool-tip-position-top);
        --tooltip-left: calc(var(--tool-tip-position-left, 0) + var(--overlay-offset, 0.25rem));
      }

      :host:after{
        position: absolute;
        display: block;
        right: 0;
        left: 0;
        height: var(--overlay-offset, 0.25rem);
        content: "";
      }

      :host(.tooltip-s):after,
      :host(.tooltip-se):after,
      :host(.tooltip-sw):after {
        bottom: 100%
      }

      :host(.tooltip-n):after,
      :host(.tooltip-ne):after,
      :host(.tooltip-nw):after {
        top: 100%;
      }

      @keyframes tooltip-appear {
        from {
          opacity: 0;
        }
        to {
          opacity: 1;
        }
      }

      :host(:popover-open),
      :host(:popover-open):before {
        animation-name: tooltip-appear;
        animation-duration: .1s;
        animation-fill-mode: forwards;
        animation-timing-function: ease-in;
      }

      :host(.\:popover-open) {
        animation-name: tooltip-appear;
        animation-duration: .1s;
        animation-fill-mode: forwards;
        animation-timing-function: ease-in;
      }

      @media (forced-colors: active) {
        :host {
          outline: solid 1px transparent;
        }

        :host:before {
          display: none;
        }
      }
    </style><slot></slot></template>You have no unread notifications</tool-tip>
</notification-indicator>

        <div class="AppHeader-user">
          <deferred-side-panel data-url="/_side-panels/user?repository_id=919401293" data-catalyst="">
  <include-fragment data-target="deferred-side-panel.fragment"><template shadowrootmode="open"><style>:host {display: block;}</style><slot></slot></template>
    <react-partial-anchor data-catalyst="">
  <button data-target="react-partial-anchor.anchor" data-login="Lisha-Sinha" aria-label="Open user navigation menu" type="button" data-view-component="true" class="Button--invisible Button--medium Button Button--invisible-noVisuals color-bg-transparent p-0" aria-expanded="false" aria-haspopup="true">  <span class="Button-content">
    <span class="Button-label"><img src="./web-technologies2025_CollegeManagementSystem_files/185951109" alt="" size="32" height="32" width="32" data-view-component="true" class="avatar circle"></span>
  </span>
</button>
  

    <script crossorigin="anonymous" defer="defer" type="application/javascript" src="./web-technologies2025_CollegeManagementSystem_files/global-user-nav-drawer-6e5872d4592f.js.download"></script>
<link crossorigin="anonymous" media="all" rel="stylesheet" href="./web-technologies2025_CollegeManagementSystem_files/primer-react.2b41f48ec06f29182cb4.module.css">
<link crossorigin="anonymous" media="all" rel="stylesheet" href="./web-technologies2025_CollegeManagementSystem_files/global-user-nav-drawer.830d6c10c9fea7fc134e.module.css">

<react-partial partial-name="global-user-nav-drawer" data-ssr="false" data-attempted-ssr="false" data-catalyst="" class="loaded">
  
  <script type="application/json" data-target="react-partial.embeddedData">{"props":{"owner":{"login":"Lisha-Sinha","name":null,"avatarUrl":"https://avatars.githubusercontent.com/u/185951109?v=4"},"drawerId":"global-user-nav-drawer","lazyLoadItemDataFetchUrl":"/_side-panels/user.json","canAddAccount":true,"addAccountPath":"/login?add_account=1\u0026return_to=https%3A%2F%2Fgithub.com%2FAmirishettyAkhila%2Fweb-technologies2025%2Fblob%2Fmain%2FCollegeManagementSystem.java","switchAccountPath":"/switch_account","loginAccountPath":"/login?add_account=1","projectsPath":"/Lisha-Sinha?tab=projects","gistsUrl":"https://gist.github.com/mine","docsUrl":"https://docs.github.com","yourEnterpriseUrl":null,"enterpriseSettingsUrl":null,"supportUrl":"https://support.github.com","showAccountSwitcher":true,"showCopilot":true,"showEnterprises":true,"showEnterprise":false,"showGists":true,"showOrganizations":true,"showSponsors":true,"showUpgrade":true,"showFeaturesPreviews":true,"showEnterpriseSettings":false,"createMenuProps":{"createRepo":true,"importRepo":true,"codespaces":true,"gist":true,"createOrg":true,"createProject":false,"createProjectUrl":"/Lisha-Sinha?tab=projects","createLegacyProject":false,"createIssue":false,"org":null,"owner":"AmirishettyAkhila","repo":"web-technologies2025"}}}</script>
  <div data-target="react-partial.reactRoot"><script type="application/json" id="__PRIMER_DATA_:r4t:__">{"resolvedServerColorMode":"day"}</script></div>
</react-partial>

  </react-partial-anchor>

  </include-fragment>
</deferred-side-panel>
        </div>

        <div class="position-absolute mt-2">
            
<site-header-logged-in-user-menu data-catalyst="">

</site-header-logged-in-user-menu>

        </div>
      </div>
    </div>


    
        <div class="AppHeader-localBar">
          <nav data-pjax="#js-repo-pjax-container" aria-label="Repository" data-view-component="true" class="js-repo-nav js-sidenav-container-pjax js-responsive-underlinenav overflow-hidden UnderlineNav">

  <ul data-view-component="true" class="UnderlineNav-body list-style-none">
      <li data-view-component="true" class="d-inline-flex">
  <a id="code-tab" href="https://github.com/AmirishettyAkhila/web-technologies2025" data-tab-item="i0code-tab" data-selected-links="repo_source repo_downloads repo_commits repo_releases repo_tags repo_branches repo_packages repo_deployments repo_attestations /AmirishettyAkhila/web-technologies2025" data-pjax="#repo-content-pjax-container" data-turbo-frame="repo-content-turbo-frame" data-hotkey="g c" data-analytics-event="{&quot;category&quot;:&quot;Underline navbar&quot;,&quot;action&quot;:&quot;Click tab&quot;,&quot;label&quot;:&quot;Code&quot;,&quot;target&quot;:&quot;UNDERLINE_NAV.TAB&quot;}" data-view-component="true" class="UnderlineNav-item no-wrap js-responsive-underlinenav-item js-selected-navigation-item selected" aria-current="page">
    
              <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-code UnderlineNav-octicon d-none d-sm-inline">
    <path d="m11.28 3.22 4.25 4.25a.75.75 0 0 1 0 1.06l-4.25 4.25a.749.749 0 0 1-1.275-.326.749.749 0 0 1 .215-.734L13.94 8l-3.72-3.72a.749.749 0 0 1 .326-1.275.749.749 0 0 1 .734.215Zm-6.56 0a.751.751 0 0 1 1.042.018.751.751 0 0 1 .018 1.042L2.06 8l3.72 3.72a.749.749 0 0 1-.326 1.275.749.749 0 0 1-.734-.215L.47 8.53a.75.75 0 0 1 0-1.06Z"></path>
</svg>
        <span data-content="Code">Code</span>
          <span id="code-repo-tab-count" data-pjax-replace="" data-turbo-replace="" title="Not available" data-view-component="true" class="Counter"></span>


    
</a></li>
      <li data-view-component="true" class="d-inline-flex">
  <a id="issues-tab" href="https://github.com/AmirishettyAkhila/web-technologies2025/issues" data-tab-item="i1issues-tab" data-selected-links="repo_issues repo_labels repo_milestones /AmirishettyAkhila/web-technologies2025/issues" data-pjax="#repo-content-pjax-container" data-turbo-frame="repo-content-turbo-frame" data-hotkey="g i" data-analytics-event="{&quot;category&quot;:&quot;Underline navbar&quot;,&quot;action&quot;:&quot;Click tab&quot;,&quot;label&quot;:&quot;Issues&quot;,&quot;target&quot;:&quot;UNDERLINE_NAV.TAB&quot;}" data-view-component="true" class="UnderlineNav-item no-wrap js-responsive-underlinenav-item js-selected-navigation-item">
    
              <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-issue-opened UnderlineNav-octicon d-none d-sm-inline">
    <path d="M8 9.5a1.5 1.5 0 1 0 0-3 1.5 1.5 0 0 0 0 3Z"></path><path d="M8 0a8 8 0 1 1 0 16A8 8 0 0 1 8 0ZM1.5 8a6.5 6.5 0 1 0 13 0 6.5 6.5 0 0 0-13 0Z"></path>
</svg>
        <span data-content="Issues">Issues</span>
          <span id="issues-repo-tab-count" data-pjax-replace="" data-turbo-replace="" title="0" hidden="hidden" data-view-component="true" class="Counter">0</span>


    
</a></li>
      <li data-view-component="true" class="d-inline-flex">
  <a id="pull-requests-tab" href="https://github.com/AmirishettyAkhila/web-technologies2025/pulls" data-tab-item="i2pull-requests-tab" data-selected-links="repo_pulls checks /AmirishettyAkhila/web-technologies2025/pulls" data-pjax="#repo-content-pjax-container" data-turbo-frame="repo-content-turbo-frame" data-hotkey="g p" data-analytics-event="{&quot;category&quot;:&quot;Underline navbar&quot;,&quot;action&quot;:&quot;Click tab&quot;,&quot;label&quot;:&quot;Pull requests&quot;,&quot;target&quot;:&quot;UNDERLINE_NAV.TAB&quot;}" data-view-component="true" class="UnderlineNav-item no-wrap js-responsive-underlinenav-item js-selected-navigation-item">
    
              <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-git-pull-request UnderlineNav-octicon d-none d-sm-inline">
    <path d="M1.5 3.25a2.25 2.25 0 1 1 3 2.122v5.256a2.251 2.251 0 1 1-1.5 0V5.372A2.25 2.25 0 0 1 1.5 3.25Zm5.677-.177L9.573.677A.25.25 0 0 1 10 .854V2.5h1A2.5 2.5 0 0 1 13.5 5v5.628a2.251 2.251 0 1 1-1.5 0V5a1 1 0 0 0-1-1h-1v1.646a.25.25 0 0 1-.427.177L7.177 3.427a.25.25 0 0 1 0-.354ZM3.75 2.5a.75.75 0 1 0 0 1.5.75.75 0 0 0 0-1.5Zm0 9.5a.75.75 0 1 0 0 1.5.75.75 0 0 0 0-1.5Zm8.25.75a.75.75 0 1 0 1.5 0 .75.75 0 0 0-1.5 0Z"></path>
</svg>
        <span data-content="Pull requests">Pull requests</span>
          <span id="pull-requests-repo-tab-count" data-pjax-replace="" data-turbo-replace="" title="0" hidden="hidden" data-view-component="true" class="Counter">0</span>


    
</a></li>
      <li data-view-component="true" class="d-inline-flex">
  <a id="actions-tab" href="https://github.com/AmirishettyAkhila/web-technologies2025/actions" data-tab-item="i3actions-tab" data-selected-links="repo_actions /AmirishettyAkhila/web-technologies2025/actions" data-pjax="#repo-content-pjax-container" data-turbo-frame="repo-content-turbo-frame" data-hotkey="g a" data-analytics-event="{&quot;category&quot;:&quot;Underline navbar&quot;,&quot;action&quot;:&quot;Click tab&quot;,&quot;label&quot;:&quot;Actions&quot;,&quot;target&quot;:&quot;UNDERLINE_NAV.TAB&quot;}" data-view-component="true" class="UnderlineNav-item no-wrap js-responsive-underlinenav-item js-selected-navigation-item">
    
              <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-play UnderlineNav-octicon d-none d-sm-inline">
    <path d="M8 0a8 8 0 1 1 0 16A8 8 0 0 1 8 0ZM1.5 8a6.5 6.5 0 1 0 13 0 6.5 6.5 0 0 0-13 0Zm4.879-2.773 4.264 2.559a.25.25 0 0 1 0 .428l-4.264 2.559A.25.25 0 0 1 6 10.559V5.442a.25.25 0 0 1 .379-.215Z"></path>
</svg>
        <span data-content="Actions">Actions</span>
          <span id="actions-repo-tab-count" data-pjax-replace="" data-turbo-replace="" title="Not available" data-view-component="true" class="Counter"></span>


    
</a></li>
      <li data-view-component="true" class="d-inline-flex">
  <a id="projects-tab" href="https://github.com/AmirishettyAkhila/web-technologies2025/projects" data-tab-item="i4projects-tab" data-selected-links="repo_projects new_repo_project repo_project /AmirishettyAkhila/web-technologies2025/projects" data-pjax="#repo-content-pjax-container" data-turbo-frame="repo-content-turbo-frame" data-hotkey="g b" data-analytics-event="{&quot;category&quot;:&quot;Underline navbar&quot;,&quot;action&quot;:&quot;Click tab&quot;,&quot;label&quot;:&quot;Projects&quot;,&quot;target&quot;:&quot;UNDERLINE_NAV.TAB&quot;}" data-view-component="true" class="UnderlineNav-item no-wrap js-responsive-underlinenav-item js-selected-navigation-item">
    
              <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-table UnderlineNav-octicon d-none d-sm-inline">
    <path d="M0 1.75C0 .784.784 0 1.75 0h12.5C15.216 0 16 .784 16 1.75v12.5A1.75 1.75 0 0 1 14.25 16H1.75A1.75 1.75 0 0 1 0 14.25ZM6.5 6.5v8h7.75a.25.25 0 0 0 .25-.25V6.5Zm8-1.5V1.75a.25.25 0 0 0-.25-.25H6.5V5Zm-13 1.5v7.75c0 .138.112.25.25.25H5v-8ZM5 5V1.5H1.75a.25.25 0 0 0-.25.25V5Z"></path>
</svg>
        <span data-content="Projects">Projects</span>
          <span id="projects-repo-tab-count" data-pjax-replace="" data-turbo-replace="" title="0" hidden="hidden" data-view-component="true" class="Counter">0</span>


    
</a></li>
      <li data-view-component="true" class="d-inline-flex">
  <a id="security-tab" href="https://github.com/AmirishettyAkhila/web-technologies2025/security" data-tab-item="i5security-tab" data-selected-links="security overview alerts policy token_scanning code_scanning /AmirishettyAkhila/web-technologies2025/security" data-pjax="#repo-content-pjax-container" data-turbo-frame="repo-content-turbo-frame" data-hotkey="g s" data-analytics-event="{&quot;category&quot;:&quot;Underline navbar&quot;,&quot;action&quot;:&quot;Click tab&quot;,&quot;label&quot;:&quot;Security&quot;,&quot;target&quot;:&quot;UNDERLINE_NAV.TAB&quot;}" data-view-component="true" class="UnderlineNav-item no-wrap js-responsive-underlinenav-item js-selected-navigation-item">
    
              <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-shield UnderlineNav-octicon d-none d-sm-inline">
    <path d="M7.467.133a1.748 1.748 0 0 1 1.066 0l5.25 1.68A1.75 1.75 0 0 1 15 3.48V7c0 1.566-.32 3.182-1.303 4.682-.983 1.498-2.585 2.813-5.032 3.855a1.697 1.697 0 0 1-1.33 0c-2.447-1.042-4.049-2.357-5.032-3.855C1.32 10.182 1 8.566 1 7V3.48a1.75 1.75 0 0 1 1.217-1.667Zm.61 1.429a.25.25 0 0 0-.153 0l-5.25 1.68a.25.25 0 0 0-.174.238V7c0 1.358.275 2.666 1.057 3.86.784 1.194 2.121 2.34 4.366 3.297a.196.196 0 0 0 .154 0c2.245-.956 3.582-2.104 4.366-3.298C13.225 9.666 13.5 8.36 13.5 7V3.48a.251.251 0 0 0-.174-.237l-5.25-1.68ZM8.75 4.75v3a.75.75 0 0 1-1.5 0v-3a.75.75 0 0 1 1.5 0ZM9 10.5a1 1 0 1 1-2 0 1 1 0 0 1 2 0Z"></path>
</svg>
        <span data-content="Security">Security</span>
          

    
</a></li>
      <li data-view-component="true" class="d-inline-flex">
  <a id="insights-tab" href="https://github.com/AmirishettyAkhila/web-technologies2025/pulse" data-tab-item="i6insights-tab" data-selected-links="repo_graphs repo_contributors dependency_graph dependabot_updates pulse people community /AmirishettyAkhila/web-technologies2025/pulse" data-pjax="#repo-content-pjax-container" data-turbo-frame="repo-content-turbo-frame" data-analytics-event="{&quot;category&quot;:&quot;Underline navbar&quot;,&quot;action&quot;:&quot;Click tab&quot;,&quot;label&quot;:&quot;Insights&quot;,&quot;target&quot;:&quot;UNDERLINE_NAV.TAB&quot;}" data-view-component="true" class="UnderlineNav-item no-wrap js-responsive-underlinenav-item js-selected-navigation-item">
    
              <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-graph UnderlineNav-octicon d-none d-sm-inline">
    <path d="M1.5 1.75V13.5h13.75a.75.75 0 0 1 0 1.5H.75a.75.75 0 0 1-.75-.75V1.75a.75.75 0 0 1 1.5 0Zm14.28 2.53-5.25 5.25a.75.75 0 0 1-1.06 0L7 7.06 4.28 9.78a.751.751 0 0 1-1.042-.018.751.751 0 0 1-.018-1.042l3.25-3.25a.75.75 0 0 1 1.06 0L10 7.94l4.72-4.72a.751.751 0 0 1 1.042.018.751.751 0 0 1 .018 1.042Z"></path>
</svg>
        <span data-content="Insights">Insights</span>
          <span id="insights-repo-tab-count" data-pjax-replace="" data-turbo-replace="" title="Not available" data-view-component="true" class="Counter"></span>


    
</a></li>
</ul>
    <div style="visibility:hidden;" data-view-component="true" class="UnderlineNav-actions js-responsive-underlinenav-overflow position-absolute pr-3 pr-md-4 pr-lg-5 right-0">      <action-menu data-select-variant="none" data-view-component="true" data-catalyst="" data-ready="true">
  <focus-group direction="vertical" mnemonics="" retain="">
    <button id="action-menu-691ce109-ef4e-4bc6-9351-b1856a7dc10e-button" popovertarget="action-menu-691ce109-ef4e-4bc6-9351-b1856a7dc10e-overlay" aria-controls="action-menu-691ce109-ef4e-4bc6-9351-b1856a7dc10e-list" aria-haspopup="true" aria-labelledby="tooltip-c3634356-41c3-4138-a5cf-5fd1847050ca" type="button" data-view-component="true" class="Button Button--iconOnly Button--secondary Button--medium UnderlineNav-item">  <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-kebab-horizontal Button-visual">
    <path d="M8 9a1.5 1.5 0 1 0 0-3 1.5 1.5 0 0 0 0 3ZM1.5 9a1.5 1.5 0 1 0 0-3 1.5 1.5 0 0 0 0 3Zm13 0a1.5 1.5 0 1 0 0-3 1.5 1.5 0 0 0 0 3Z"></path>
</svg>
</button><tool-tip id="tooltip-c3634356-41c3-4138-a5cf-5fd1847050ca" for="action-menu-691ce109-ef4e-4bc6-9351-b1856a7dc10e-button" popover="manual" data-direction="s" data-type="label" data-view-component="true" class="sr-only position-absolute" aria-hidden="true" role="tooltip"><template shadowrootmode="open"><style>
      :host {
        --tooltip-top: var(--tool-tip-position-top, 0);
        --tooltip-left: var(--tool-tip-position-left, 0);
        padding: var(--overlay-paddingBlock-condensed) var(--overlay-padding-condensed) !important;
        font: var(--text-body-shorthand-small);
        color: var(--tooltip-fgColor, var(--fgColor-onEmphasis)) !important;
        text-align: center;
        text-decoration: none;
        text-shadow: none;
        text-transform: none;
        letter-spacing: normal;
        word-wrap: break-word;
        white-space: pre;
        background: var(--tooltip-bgColor, var(--bgColor-emphasis)) !important;
        border-radius: var(--borderRadius-medium);
        border: 0 !important;
        opacity: 0;
        max-width: var(--overlay-width-small);
        word-wrap: break-word;
        white-space: normal;
        width: max-content !important;
        inset: var(--tooltip-top) auto auto var(--tooltip-left) !important;
        overflow: visible !important;
        text-wrap: balance;
      }

      :host(:is(.tooltip-n, .tooltip-nw, .tooltip-ne)) {
        --tooltip-top: calc(var(--tool-tip-position-top, 0) - var(--overlay-offset, 0.25rem));
        --tooltip-left: var(--tool-tip-position-left);
      }

      :host(:is(.tooltip-s, .tooltip-sw, .tooltip-se)) {
        --tooltip-top: calc(var(--tool-tip-position-top, 0) + var(--overlay-offset, 0.25rem));
        --tooltip-left: var(--tool-tip-position-left);
      }

      :host(.tooltip-w) {
        --tooltip-top: var(--tool-tip-position-top);
        --tooltip-left: calc(var(--tool-tip-position-left, 0) - var(--overlay-offset, 0.25rem));
      }

      :host(.tooltip-e) {
        --tooltip-top: var(--tool-tip-position-top);
        --tooltip-left: calc(var(--tool-tip-position-left, 0) + var(--overlay-offset, 0.25rem));
      }

      :host:after{
        position: absolute;
        display: block;
        right: 0;
        left: 0;
        height: var(--overlay-offset, 0.25rem);
        content: "";
      }

      :host(.tooltip-s):after,
      :host(.tooltip-se):after,
      :host(.tooltip-sw):after {
        bottom: 100%
      }

      :host(.tooltip-n):after,
      :host(.tooltip-ne):after,
      :host(.tooltip-nw):after {
        top: 100%;
      }

      @keyframes tooltip-appear {
        from {
          opacity: 0;
        }
        to {
          opacity: 1;
        }
      }

      :host(:popover-open),
      :host(:popover-open):before {
        animation-name: tooltip-appear;
        animation-duration: .1s;
        animation-fill-mode: forwards;
        animation-timing-function: ease-in;
      }

      :host(.\:popover-open) {
        animation-name: tooltip-appear;
        animation-duration: .1s;
        animation-fill-mode: forwards;
        animation-timing-function: ease-in;
      }

      @media (forced-colors: active) {
        :host {
          outline: solid 1px transparent;
        }

        :host:before {
          display: none;
        }
      }
    </style><slot></slot></template>Additional navigation options</tool-tip>


<anchored-position data-target="action-menu.overlay" id="action-menu-691ce109-ef4e-4bc6-9351-b1856a7dc10e-overlay" anchor="action-menu-691ce109-ef4e-4bc6-9351-b1856a7dc10e-button" align="start" side="outside-bottom" anchor-offset="normal" popover="auto" data-view-component="true" style="inset: 36px auto auto 0px;">
  <div data-view-component="true" class="Overlay Overlay--size-auto">
    
      <div data-view-component="true" class="Overlay-body Overlay-body--paddingNone">          <action-list data-catalyst="">
  <div data-view-component="true">
    <ul aria-labelledby="action-menu-691ce109-ef4e-4bc6-9351-b1856a7dc10e-button" id="action-menu-691ce109-ef4e-4bc6-9351-b1856a7dc10e-list" role="menu" data-view-component="true" class="ActionListWrap--inset ActionListWrap">
        <li hidden="" data-menu-item="i0code-tab" data-targets="action-list.items" role="none" data-view-component="true" class="ActionListItem">
    
    
    <a tabindex="-1" id="item-7e5c3a09-0c3a-4210-842a-64e5e5e14680" href="https://github.com/AmirishettyAkhila/web-technologies2025" role="menuitem" data-view-component="true" class="ActionListContent ActionListContent--visual16">
        <span class="ActionListItem-visual ActionListItem-visual--leading">
          <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-code">
    <path d="m11.28 3.22 4.25 4.25a.75.75 0 0 1 0 1.06l-4.25 4.25a.749.749 0 0 1-1.275-.326.749.749 0 0 1 .215-.734L13.94 8l-3.72-3.72a.749.749 0 0 1 .326-1.275.749.749 0 0 1 .734.215Zm-6.56 0a.751.751 0 0 1 1.042.018.751.751 0 0 1 .018 1.042L2.06 8l3.72 3.72a.749.749 0 0 1-.326 1.275.749.749 0 0 1-.734-.215L.47 8.53a.75.75 0 0 1 0-1.06Z"></path>
</svg>
        </span>
      
        <span data-view-component="true" class="ActionListItem-label">
          Code
</span>      
</a>
  
</li>
        <li hidden="" data-menu-item="i1issues-tab" data-targets="action-list.items" role="none" data-view-component="true" class="ActionListItem">
    
    
    <a tabindex="-1" id="item-0f82ad5e-2d7d-4dba-adfe-f5eebfb720e2" href="https://github.com/AmirishettyAkhila/web-technologies2025/issues" role="menuitem" data-view-component="true" class="ActionListContent ActionListContent--visual16">
        <span class="ActionListItem-visual ActionListItem-visual--leading">
          <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-issue-opened">
    <path d="M8 9.5a1.5 1.5 0 1 0 0-3 1.5 1.5 0 0 0 0 3Z"></path><path d="M8 0a8 8 0 1 1 0 16A8 8 0 0 1 8 0ZM1.5 8a6.5 6.5 0 1 0 13 0 6.5 6.5 0 0 0-13 0Z"></path>
</svg>
        </span>
      
        <span data-view-component="true" class="ActionListItem-label">
          Issues
</span>      
</a>
  
</li>
        <li hidden="" data-menu-item="i2pull-requests-tab" data-targets="action-list.items" role="none" data-view-component="true" class="ActionListItem">
    
    
    <a tabindex="-1" id="item-cf42da31-7c33-4bc9-9234-25e3bb9c892b" href="https://github.com/AmirishettyAkhila/web-technologies2025/pulls" role="menuitem" data-view-component="true" class="ActionListContent ActionListContent--visual16">
        <span class="ActionListItem-visual ActionListItem-visual--leading">
          <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-git-pull-request">
    <path d="M1.5 3.25a2.25 2.25 0 1 1 3 2.122v5.256a2.251 2.251 0 1 1-1.5 0V5.372A2.25 2.25 0 0 1 1.5 3.25Zm5.677-.177L9.573.677A.25.25 0 0 1 10 .854V2.5h1A2.5 2.5 0 0 1 13.5 5v5.628a2.251 2.251 0 1 1-1.5 0V5a1 1 0 0 0-1-1h-1v1.646a.25.25 0 0 1-.427.177L7.177 3.427a.25.25 0 0 1 0-.354ZM3.75 2.5a.75.75 0 1 0 0 1.5.75.75 0 0 0 0-1.5Zm0 9.5a.75.75 0 1 0 0 1.5.75.75 0 0 0 0-1.5Zm8.25.75a.75.75 0 1 0 1.5 0 .75.75 0 0 0-1.5 0Z"></path>
</svg>
        </span>
      
        <span data-view-component="true" class="ActionListItem-label">
          Pull requests
</span>      
</a>
  
</li>
        <li hidden="" data-menu-item="i3actions-tab" data-targets="action-list.items" role="none" data-view-component="true" class="ActionListItem">
    
    
    <a tabindex="-1" id="item-a3744a9a-21ab-4832-982c-2c92d3b42101" href="https://github.com/AmirishettyAkhila/web-technologies2025/actions" role="menuitem" data-view-component="true" class="ActionListContent ActionListContent--visual16">
        <span class="ActionListItem-visual ActionListItem-visual--leading">
          <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-play">
    <path d="M8 0a8 8 0 1 1 0 16A8 8 0 0 1 8 0ZM1.5 8a6.5 6.5 0 1 0 13 0 6.5 6.5 0 0 0-13 0Zm4.879-2.773 4.264 2.559a.25.25 0 0 1 0 .428l-4.264 2.559A.25.25 0 0 1 6 10.559V5.442a.25.25 0 0 1 .379-.215Z"></path>
</svg>
        </span>
      
        <span data-view-component="true" class="ActionListItem-label">
          Actions
</span>      
</a>
  
</li>
        <li hidden="" data-menu-item="i4projects-tab" data-targets="action-list.items" role="none" data-view-component="true" class="ActionListItem">
    
    
    <a tabindex="-1" id="item-843f10c2-1870-4d43-a75c-51155e576fef" href="https://github.com/AmirishettyAkhila/web-technologies2025/projects" role="menuitem" data-view-component="true" class="ActionListContent ActionListContent--visual16">
        <span class="ActionListItem-visual ActionListItem-visual--leading">
          <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-table">
    <path d="M0 1.75C0 .784.784 0 1.75 0h12.5C15.216 0 16 .784 16 1.75v12.5A1.75 1.75 0 0 1 14.25 16H1.75A1.75 1.75 0 0 1 0 14.25ZM6.5 6.5v8h7.75a.25.25 0 0 0 .25-.25V6.5Zm8-1.5V1.75a.25.25 0 0 0-.25-.25H6.5V5Zm-13 1.5v7.75c0 .138.112.25.25.25H5v-8ZM5 5V1.5H1.75a.25.25 0 0 0-.25.25V5Z"></path>
</svg>
        </span>
      
        <span data-view-component="true" class="ActionListItem-label">
          Projects
</span>      
</a>
  
</li>
        <li hidden="" data-menu-item="i5security-tab" data-targets="action-list.items" role="none" data-view-component="true" class="ActionListItem">
    
    
    <a tabindex="-1" id="item-0fafc50f-3e7c-409f-a9d3-d2a4cf3a4f11" href="https://github.com/AmirishettyAkhila/web-technologies2025/security" role="menuitem" data-view-component="true" class="ActionListContent ActionListContent--visual16">
        <span class="ActionListItem-visual ActionListItem-visual--leading">
          <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-shield">
    <path d="M7.467.133a1.748 1.748 0 0 1 1.066 0l5.25 1.68A1.75 1.75 0 0 1 15 3.48V7c0 1.566-.32 3.182-1.303 4.682-.983 1.498-2.585 2.813-5.032 3.855a1.697 1.697 0 0 1-1.33 0c-2.447-1.042-4.049-2.357-5.032-3.855C1.32 10.182 1 8.566 1 7V3.48a1.75 1.75 0 0 1 1.217-1.667Zm.61 1.429a.25.25 0 0 0-.153 0l-5.25 1.68a.25.25 0 0 0-.174.238V7c0 1.358.275 2.666 1.057 3.86.784 1.194 2.121 2.34 4.366 3.297a.196.196 0 0 0 .154 0c2.245-.956 3.582-2.104 4.366-3.298C13.225 9.666 13.5 8.36 13.5 7V3.48a.251.251 0 0 0-.174-.237l-5.25-1.68ZM8.75 4.75v3a.75.75 0 0 1-1.5 0v-3a.75.75 0 0 1 1.5 0ZM9 10.5a1 1 0 1 1-2 0 1 1 0 0 1 2 0Z"></path>
</svg>
        </span>
      
        <span data-view-component="true" class="ActionListItem-label">
          Security
</span>      
</a>
  
</li>
        <li hidden="" data-menu-item="i6insights-tab" data-targets="action-list.items" role="none" data-view-component="true" class="ActionListItem">
    
    
    <a tabindex="-1" id="item-00a452a9-d859-4c59-a9e3-ef428f594224" href="https://github.com/AmirishettyAkhila/web-technologies2025/pulse" role="menuitem" data-view-component="true" class="ActionListContent ActionListContent--visual16">
        <span class="ActionListItem-visual ActionListItem-visual--leading">
          <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-graph">
    <path d="M1.5 1.75V13.5h13.75a.75.75 0 0 1 0 1.5H.75a.75.75 0 0 1-.75-.75V1.75a.75.75 0 0 1 1.5 0Zm14.28 2.53-5.25 5.25a.75.75 0 0 1-1.06 0L7 7.06 4.28 9.78a.751.751 0 0 1-1.042-.018.751.751 0 0 1-.018-1.042l3.25-3.25a.75.75 0 0 1 1.06 0L10 7.94l4.72-4.72a.751.751 0 0 1 1.042.018.751.751 0 0 1 .018 1.042Z"></path>
</svg>
        </span>
      
        <span data-view-component="true" class="ActionListItem-label">
          Insights
</span>      
</a>
  
</li>
</ul>    
</div></action-list>


</div>
      
</div></anchored-position>  </focus-group>
</action-menu></div>
</nav>
        </div>
</header>


      <div hidden="hidden" data-view-component="true" class="js-stale-session-flash stale-session-flash flash flash-warn flash-full">
  
        <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-alert">
    <path d="M6.457 1.047c.659-1.234 2.427-1.234 3.086 0l6.082 11.378A1.75 1.75 0 0 1 14.082 15H1.918a1.75 1.75 0 0 1-1.543-2.575Zm1.763.707a.25.25 0 0 0-.44 0L1.698 13.132a.25.25 0 0 0 .22.368h12.164a.25.25 0 0 0 .22-.368Zm.53 3.996v2.5a.75.75 0 0 1-1.5 0v-2.5a.75.75 0 0 1 1.5 0ZM9 11a1 1 0 1 1-2 0 1 1 0 0 1 2 0Z"></path>
</svg>
        <span class="js-stale-session-flash-signed-in" hidden="">You signed in with another tab or window. <a class="Link--inTextBlock" href="https://github.com/AmirishettyAkhila/web-technologies2025/blob/main/CollegeManagementSystem.java">Reload</a> to refresh your session.</span>
        <span class="js-stale-session-flash-signed-out" hidden="">You signed out in another tab or window. <a class="Link--inTextBlock" href="https://github.com/AmirishettyAkhila/web-technologies2025/blob/main/CollegeManagementSystem.java">Reload</a> to refresh your session.</span>
        <span class="js-stale-session-flash-switched" hidden="">You switched accounts on another tab or window. <a class="Link--inTextBlock" href="https://github.com/AmirishettyAkhila/web-technologies2025/blob/main/CollegeManagementSystem.java">Reload</a> to refresh your session.</span>

    <button id="icon-button-0c2d8b26-a44e-4d82-b8cc-3215da1aed99" aria-labelledby="tooltip-6714975e-fd2d-491e-a00b-921c2dbcee47" type="button" data-view-component="true" class="Button Button--iconOnly Button--invisible Button--medium flash-close js-flash-close">  <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-x Button-visual">
    <path d="M3.72 3.72a.75.75 0 0 1 1.06 0L8 6.94l3.22-3.22a.749.749 0 0 1 1.275.326.749.749 0 0 1-.215.734L9.06 8l3.22 3.22a.749.749 0 0 1-.326 1.275.749.749 0 0 1-.734-.215L8 9.06l-3.22 3.22a.751.751 0 0 1-1.042-.018.751.751 0 0 1-.018-1.042L6.94 8 3.72 4.78a.75.75 0 0 1 0-1.06Z"></path>
</svg>
</button><tool-tip id="tooltip-6714975e-fd2d-491e-a00b-921c2dbcee47" for="icon-button-0c2d8b26-a44e-4d82-b8cc-3215da1aed99" popover="manual" data-direction="s" data-type="label" data-view-component="true" class="sr-only position-absolute" aria-hidden="true" role="tooltip"><template shadowrootmode="open"><style>
      :host {
        --tooltip-top: var(--tool-tip-position-top, 0);
        --tooltip-left: var(--tool-tip-position-left, 0);
        padding: var(--overlay-paddingBlock-condensed) var(--overlay-padding-condensed) !important;
        font: var(--text-body-shorthand-small);
        color: var(--tooltip-fgColor, var(--fgColor-onEmphasis)) !important;
        text-align: center;
        text-decoration: none;
        text-shadow: none;
        text-transform: none;
        letter-spacing: normal;
        word-wrap: break-word;
        white-space: pre;
        background: var(--tooltip-bgColor, var(--bgColor-emphasis)) !important;
        border-radius: var(--borderRadius-medium);
        border: 0 !important;
        opacity: 0;
        max-width: var(--overlay-width-small);
        word-wrap: break-word;
        white-space: normal;
        width: max-content !important;
        inset: var(--tooltip-top) auto auto var(--tooltip-left) !important;
        overflow: visible !important;
        text-wrap: balance;
      }

      :host(:is(.tooltip-n, .tooltip-nw, .tooltip-ne)) {
        --tooltip-top: calc(var(--tool-tip-position-top, 0) - var(--overlay-offset, 0.25rem));
        --tooltip-left: var(--tool-tip-position-left);
      }

      :host(:is(.tooltip-s, .tooltip-sw, .tooltip-se)) {
        --tooltip-top: calc(var(--tool-tip-position-top, 0) + var(--overlay-offset, 0.25rem));
        --tooltip-left: var(--tool-tip-position-left);
      }

      :host(.tooltip-w) {
        --tooltip-top: var(--tool-tip-position-top);
        --tooltip-left: calc(var(--tool-tip-position-left, 0) - var(--overlay-offset, 0.25rem));
      }

      :host(.tooltip-e) {
        --tooltip-top: var(--tool-tip-position-top);
        --tooltip-left: calc(var(--tool-tip-position-left, 0) + var(--overlay-offset, 0.25rem));
      }

      :host:after{
        position: absolute;
        display: block;
        right: 0;
        left: 0;
        height: var(--overlay-offset, 0.25rem);
        content: "";
      }

      :host(.tooltip-s):after,
      :host(.tooltip-se):after,
      :host(.tooltip-sw):after {
        bottom: 100%
      }

      :host(.tooltip-n):after,
      :host(.tooltip-ne):after,
      :host(.tooltip-nw):after {
        top: 100%;
      }

      @keyframes tooltip-appear {
        from {
          opacity: 0;
        }
        to {
          opacity: 1;
        }
      }

      :host(:popover-open),
      :host(:popover-open):before {
        animation-name: tooltip-appear;
        animation-duration: .1s;
        animation-fill-mode: forwards;
        animation-timing-function: ease-in;
      }

      :host(.\:popover-open) {
        animation-name: tooltip-appear;
        animation-duration: .1s;
        animation-fill-mode: forwards;
        animation-timing-function: ease-in;
      }

      @media (forced-colors: active) {
        :host {
          outline: solid 1px transparent;
        }

        :host:before {
          display: none;
        }
      }
    </style><slot></slot></template>Dismiss alert</tool-tip>


  
</div>
          
    </div>

  <div id="start-of-content" class="show-on-focus"></div>








    <div id="js-flash-container" class="flash-container" data-turbo-replace="">




  <template class="js-flash-template"></template>
</div>


    
  <notification-shelf-watcher data-base-url="https://github.com/notifications/beta/shelf" data-channel="eyJjIjoibm90aWZpY2F0aW9uLWNoYW5nZWQ6MTg1OTUxMTA5IiwidCI6MTc0MDUwMTI5OX0=--001aa5067538832b0a43a8e3c5d508c2be02df5a0879a0d46ccec8cc59ed9537" data-view-component="true" class="js-socket-channel" data-refresh-delay="500" data-catalyst="" data-throttle-delay="5000"></notification-shelf-watcher>
  <div hidden="" data-initial="" data-target="notification-shelf-watcher.placeholder"></div>






  <div class="application-main " data-commit-hovercards-enabled="" data-discussion-hovercards-enabled="" data-issue-and-pr-hovercards-enabled="" data-project-hovercards-enabled="">
        <div itemscope="" itemtype="http://schema.org/SoftwareSourceCode" class="">
    <main id="js-repo-pjax-container">
      
      






    
  <div id="repository-container-header" data-turbo-replace="" hidden=""></div>




<turbo-frame id="repo-content-turbo-frame" target="_top" data-turbo-action="advance" class="">
    <div id="repo-content-pjax-container" class="repository-content ">
      <a href="https://github.dev/" class="d-none js-github-dev-shortcut" data-hotkey=".,Mod+Alt+.">Open in github.dev</a>
  <a href="https://github.dev/" class="d-none js-github-dev-new-tab-shortcut" data-hotkey="Shift+.,Shift+&gt;,&gt;" target="_blank" rel="noopener noreferrer">Open in a new github.dev tab</a>
    <a class="d-none" data-hotkey=",,Mod+Alt+," target="_blank" href="https://github.com/codespaces/new/AmirishettyAkhila/web-technologies2025/tree/main?resume=1">Open in codespace</a>




    
      
    








<react-app app-name="react-code-view" initial-path="/AmirishettyAkhila/web-technologies2025/blob/main/CollegeManagementSystem.java" style="display: block; min-height: calc(100vh - 64px);" data-attempted-ssr="true" data-ssr="true" data-lazy="false" data-alternate="false" data-data-router-enabled="false" data-catalyst="" class="loaded">
  
  <script type="application/json" data-target="react-app.embeddedData">{"payload":{"allShortcutsEnabled":true,"fileTree":{"":{"items":[{"name":"CollegeManagementSystem.java","path":"CollegeManagementSystem.java","contentType":"file"},{"name":"Database Details.txt","path":"Database Details.txt","contentType":"file"},{"name":"StudentManagementSystem.java","path":"StudentManagementSystem.java","contentType":"file"},{"name":"finance.html","path":"finance.html","contentType":"file"},{"name":"movie.html","path":"movie.html","contentType":"file"},{"name":"registration.html","path":"registration.html","contentType":"file"},{"name":"store.html","path":"store.html","contentType":"file"},{"name":"weather.html","path":"weather.html","contentType":"file"}],"totalCount":8}},"fileTreeProcessingTime":2.547748,"foldersToFetch":[],"repo":{"id":919401293,"defaultBranch":"main","name":"web-technologies2025","ownerLogin":"AmirishettyAkhila","currentUserCanPush":false,"isFork":false,"isEmpty":false,"createdAt":"2025-01-20T05:23:04.000-05:00","ownerAvatar":"https://avatars.githubusercontent.com/u/163986912?v=4","public":true,"private":false,"isOrgOwned":false},"codeLineWrapEnabled":false,"symbolsExpanded":false,"treeExpanded":true,"refInfo":{"name":"main","listCacheKey":"v0:1737368628.0","canEdit":true,"refType":"branch","currentOid":"9923b3982adcce1bfe4aedaffcff5f7dd2be4f75"},"path":"CollegeManagementSystem.java","currentUser":{"id":185951109,"login":"Lisha-Sinha","userEmail":"sinhalisha75@gmail.com"},"blob":{"rawLines":["import java.sql.*;","import java.util.Scanner;","","public class CollegeManagementSystem {","    private static final String DATABASE_URL = \"jdbc:mysql://localhost:3306/\";","    private static final String DATABASE_NAME = \"collegeDB\";","    private static final String USER = \"root\";","    private static final String PASSWORD = \"admin\";","","    public static void main(String[] args) {","        try (Connection conn = DriverManager.getConnection(DATABASE_URL + \"mysql\", USER, PASSWORD);","             Scanner scanner = new Scanner(System.in)) {","            ","            createDatabase(conn);","            try (Connection dbConn = DriverManager.getConnection(DATABASE_URL + DATABASE_NAME, USER, PASSWORD)) {","                createTable(dbConn);","                ","                while (true) {","                    System.out.println(\"Choose an operation: \\n1. Insert\\n2. Update\\n3. Delete\\n4. Display\\n5. Exit\");","                    int choice = scanner.nextInt();","                    scanner.nextLine();","","                    switch (choice) {","                        case 1:","                            insertCourse(dbConn, scanner);","                            break;","                        case 2:","                            updateCourse(dbConn, scanner);","                            break;","                        case 3:","                            deleteCourse(dbConn, scanner);","                            break;","                        case 4:","                            displayCourses(dbConn);","                            break;","                        case 5:","                            System.out.println(\"Exiting program.\");","                            return;","                        default:","                            System.out.println(\"Invalid choice. Try again.\");","                    }","                }","            }","        } catch (SQLException e) {","            e.printStackTrace();","        }","    }","","    private static void createDatabase(Connection conn) throws SQLException {","        String sql = \"CREATE DATABASE IF NOT EXISTS \" + DATABASE_NAME;","        try (Statement stmt = conn.createStatement()) {","            stmt.executeUpdate(sql);","            System.out.println(\"Database '\" + DATABASE_NAME + \"' created successfully or already exists.\");","        }","    }","","    private static void createTable(Connection conn) throws SQLException {","        String sql = \"CREATE TABLE IF NOT EXISTS Courses (\" +","                     \"CourseID INT AUTO_INCREMENT PRIMARY KEY, \" +","                     \"Name VARCHAR(255) NOT NULL, \" +","                     \"Credits INT NOT NULL)\";","        try (Statement stmt = conn.createStatement()) {","            stmt.executeUpdate(sql);","            System.out.println(\"Table 'Courses' created successfully.\");","        }","    }","","    private static void insertCourse(Connection conn, Scanner scanner) throws SQLException {","        System.out.print(\"Enter Course Name: \");","        String name = scanner.nextLine();","        System.out.print(\"Enter Credits: \");","        int credits = scanner.nextInt();","        scanner.nextLine();","","        String sql = \"INSERT INTO Courses (Name, Credits) VALUES (?, ?)\";","        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {","            pstmt.setString(1, name);","            pstmt.setInt(2, credits);","            pstmt.executeUpdate();","            System.out.println(\"Record inserted successfully.\");","        }","    }","","    private static void updateCourse(Connection conn, Scanner scanner) throws SQLException {","        System.out.print(\"Enter CourseID to update: \");","        int id = scanner.nextInt();","        System.out.print(\"Enter new Credits value: \");","        int credits = scanner.nextInt();","        scanner.nextLine();","","        String sql = \"UPDATE Courses SET Credits = ? WHERE CourseID = ?\";","        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {","            pstmt.setInt(1, credits);","            pstmt.setInt(2, id);","            int rowsUpdated = pstmt.executeUpdate();","            System.out.println(rowsUpdated \u003e 0 ? \"Record updated successfully.\" : \"CourseID not found.\");","        }","    }","","    private static void deleteCourse(Connection conn, Scanner scanner) throws SQLException {","        System.out.print(\"Enter CourseID to delete: \");","        int id = scanner.nextInt();","        scanner.nextLine();","","        String sql = \"DELETE FROM Courses WHERE CourseID = ?\";","        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {","            pstmt.setInt(1, id);","            int rowsDeleted = pstmt.executeUpdate();","            System.out.println(rowsDeleted \u003e 0 ? \"Record deleted successfully.\" : \"CourseID not found.\");","        }","    }","","    private static void displayCourses(Connection conn) throws SQLException {","        String sql = \"SELECT * FROM Courses\";","        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {","            System.out.println(\"Courses Table Records:\");","            System.out.println(\"-----------------------------------------\");","            while (rs.next()) {","                System.out.println(\"CourseID: \" + rs.getInt(\"CourseID\") + \" | Name: \" + rs.getString(\"Name\") + \" | Credits: \" + rs.getInt(\"Credits\"));","            }","        }","    }","}"],"stylingDirectives":null,"colorizedLines":["\u003cspan class=pl-k\u003eimport\u003c/span\u003e \u003cspan class=pl-s1\u003ejava\u003c/span\u003e.\u003cspan class=pl-s1\u003esql\u003c/span\u003e.*;","\u003cspan class=pl-k\u003eimport\u003c/span\u003e \u003cspan class=pl-s1\u003ejava\u003c/span\u003e.\u003cspan class=pl-s1\u003eutil\u003c/span\u003e.\u003cspan class=pl-s1\u003eScanner\u003c/span\u003e;","","\u003cspan class=pl-k\u003epublic\u003c/span\u003e \u003cspan class=pl-k\u003eclass\u003c/span\u003e \u003cspan class=pl-smi\u003eCollegeManagementSystem\u003c/span\u003e {","    \u003cspan class=pl-k\u003eprivate\u003c/span\u003e \u003cspan class=pl-k\u003estatic\u003c/span\u003e \u003cspan class=pl-k\u003efinal\u003c/span\u003e \u003cspan class=pl-smi\u003eString\u003c/span\u003e \u003cspan class=pl-c1\u003eDATABASE_URL\u003c/span\u003e = \u003cspan class=pl-s\u003e\u0026quot;jdbc:mysql://localhost:3306/\u0026quot;\u003c/span\u003e;","    \u003cspan class=pl-k\u003eprivate\u003c/span\u003e \u003cspan class=pl-k\u003estatic\u003c/span\u003e \u003cspan class=pl-k\u003efinal\u003c/span\u003e \u003cspan class=pl-smi\u003eString\u003c/span\u003e \u003cspan class=pl-c1\u003eDATABASE_NAME\u003c/span\u003e = \u003cspan class=pl-s\u003e\u0026quot;collegeDB\u0026quot;\u003c/span\u003e;","    \u003cspan class=pl-k\u003eprivate\u003c/span\u003e \u003cspan class=pl-k\u003estatic\u003c/span\u003e \u003cspan class=pl-k\u003efinal\u003c/span\u003e \u003cspan class=pl-smi\u003eString\u003c/span\u003e \u003cspan class=pl-c1\u003eUSER\u003c/span\u003e = \u003cspan class=pl-s\u003e\u0026quot;root\u0026quot;\u003c/span\u003e;","    \u003cspan class=pl-k\u003eprivate\u003c/span\u003e \u003cspan class=pl-k\u003estatic\u003c/span\u003e \u003cspan class=pl-k\u003efinal\u003c/span\u003e \u003cspan class=pl-smi\u003eString\u003c/span\u003e \u003cspan class=pl-c1\u003ePASSWORD\u003c/span\u003e = \u003cspan class=pl-s\u003e\u0026quot;admin\u0026quot;\u003c/span\u003e;","","    \u003cspan class=pl-k\u003epublic\u003c/span\u003e \u003cspan class=pl-k\u003estatic\u003c/span\u003e \u003cspan class=pl-smi\u003evoid\u003c/span\u003e \u003cspan class=pl-en\u003emain\u003c/span\u003e(\u003cspan class=pl-smi\u003eString\u003c/span\u003e[] \u003cspan class=pl-s1\u003eargs\u003c/span\u003e) {","        \u003cspan class=pl-k\u003etry\u003c/span\u003e (\u003cspan class=pl-smi\u003eConnection\u003c/span\u003e \u003cspan class=pl-s1\u003econn\u003c/span\u003e = \u003cspan class=pl-smi\u003eDriverManager\u003c/span\u003e.\u003cspan class=pl-en\u003egetConnection\u003c/span\u003e(\u003cspan class=pl-c1\u003eDATABASE_URL\u003c/span\u003e + \u003cspan class=pl-s\u003e\u0026quot;mysql\u0026quot;\u003c/span\u003e, \u003cspan class=pl-c1\u003eUSER\u003c/span\u003e, \u003cspan class=pl-c1\u003ePASSWORD\u003c/span\u003e);","             \u003cspan class=pl-smi\u003eScanner\u003c/span\u003e \u003cspan class=pl-s1\u003escanner\u003c/span\u003e = \u003cspan class=pl-k\u003enew\u003c/span\u003e \u003cspan class=pl-smi\u003eScanner\u003c/span\u003e(\u003cspan class=pl-smi\u003eSystem\u003c/span\u003e.\u003cspan class=pl-s1\u003ein\u003c/span\u003e)) {","            ","            \u003cspan class=pl-en\u003ecreateDatabase\u003c/span\u003e(\u003cspan class=pl-s1\u003econn\u003c/span\u003e);","            \u003cspan class=pl-k\u003etry\u003c/span\u003e (\u003cspan class=pl-smi\u003eConnection\u003c/span\u003e \u003cspan class=pl-s1\u003edbConn\u003c/span\u003e = \u003cspan class=pl-smi\u003eDriverManager\u003c/span\u003e.\u003cspan class=pl-en\u003egetConnection\u003c/span\u003e(\u003cspan class=pl-c1\u003eDATABASE_URL\u003c/span\u003e + \u003cspan class=pl-c1\u003eDATABASE_NAME\u003c/span\u003e, \u003cspan class=pl-c1\u003eUSER\u003c/span\u003e, \u003cspan class=pl-c1\u003ePASSWORD\u003c/span\u003e)) {","                \u003cspan class=pl-en\u003ecreateTable\u003c/span\u003e(\u003cspan class=pl-s1\u003edbConn\u003c/span\u003e);","                ","                \u003cspan class=pl-k\u003ewhile\u003c/span\u003e (\u003cspan class=pl-c1\u003etrue\u003c/span\u003e) {","                    \u003cspan class=pl-smi\u003eSystem\u003c/span\u003e.\u003cspan class=pl-s1\u003eout\u003c/span\u003e.\u003cspan class=pl-en\u003eprintln\u003c/span\u003e(\u003cspan class=pl-s\u003e\u0026quot;Choose an operation: \u003cspan class=pl-cce\u003e\\n\u003c/span\u003e1. Insert\u003cspan class=pl-cce\u003e\\n\u003c/span\u003e2. Update\u003cspan class=pl-cce\u003e\\n\u003c/span\u003e3. Delete\u003cspan class=pl-cce\u003e\\n\u003c/span\u003e4. Display\u003cspan class=pl-cce\u003e\\n\u003c/span\u003e5. Exit\u0026quot;\u003c/span\u003e);","                    \u003cspan class=pl-smi\u003eint\u003c/span\u003e \u003cspan class=pl-s1\u003echoice\u003c/span\u003e = \u003cspan class=pl-s1\u003escanner\u003c/span\u003e.\u003cspan class=pl-en\u003enextInt\u003c/span\u003e();","                    \u003cspan class=pl-s1\u003escanner\u003c/span\u003e.\u003cspan class=pl-en\u003enextLine\u003c/span\u003e();","","                    \u003cspan class=pl-k\u003eswitch\u003c/span\u003e (\u003cspan class=pl-s1\u003echoice\u003c/span\u003e) {","                        \u003cspan class=pl-k\u003ecase\u003c/span\u003e \u003cspan class=pl-c1\u003e1\u003c/span\u003e:","                            \u003cspan class=pl-en\u003einsertCourse\u003c/span\u003e(\u003cspan class=pl-s1\u003edbConn\u003c/span\u003e, \u003cspan class=pl-s1\u003escanner\u003c/span\u003e);","                            \u003cspan class=pl-k\u003ebreak\u003c/span\u003e;","                        \u003cspan class=pl-k\u003ecase\u003c/span\u003e \u003cspan class=pl-c1\u003e2\u003c/span\u003e:","                            \u003cspan class=pl-en\u003eupdateCourse\u003c/span\u003e(\u003cspan class=pl-s1\u003edbConn\u003c/span\u003e, \u003cspan class=pl-s1\u003escanner\u003c/span\u003e);","                            \u003cspan class=pl-k\u003ebreak\u003c/span\u003e;","                        \u003cspan class=pl-k\u003ecase\u003c/span\u003e \u003cspan class=pl-c1\u003e3\u003c/span\u003e:","                            \u003cspan class=pl-en\u003edeleteCourse\u003c/span\u003e(\u003cspan class=pl-s1\u003edbConn\u003c/span\u003e, \u003cspan class=pl-s1\u003escanner\u003c/span\u003e);","                            \u003cspan class=pl-k\u003ebreak\u003c/span\u003e;","                        \u003cspan class=pl-k\u003ecase\u003c/span\u003e \u003cspan class=pl-c1\u003e4\u003c/span\u003e:","                            \u003cspan class=pl-en\u003edisplayCourses\u003c/span\u003e(\u003cspan class=pl-s1\u003edbConn\u003c/span\u003e);","                            \u003cspan class=pl-k\u003ebreak\u003c/span\u003e;","                        \u003cspan class=pl-k\u003ecase\u003c/span\u003e \u003cspan class=pl-c1\u003e5\u003c/span\u003e:","                            \u003cspan class=pl-smi\u003eSystem\u003c/span\u003e.\u003cspan class=pl-s1\u003eout\u003c/span\u003e.\u003cspan class=pl-en\u003eprintln\u003c/span\u003e(\u003cspan class=pl-s\u003e\u0026quot;Exiting program.\u0026quot;\u003c/span\u003e);","                            \u003cspan class=pl-k\u003ereturn\u003c/span\u003e;","                        \u003cspan class=pl-k\u003edefault\u003c/span\u003e:","                            \u003cspan class=pl-smi\u003eSystem\u003c/span\u003e.\u003cspan class=pl-s1\u003eout\u003c/span\u003e.\u003cspan class=pl-en\u003eprintln\u003c/span\u003e(\u003cspan class=pl-s\u003e\u0026quot;Invalid choice. Try again.\u0026quot;\u003c/span\u003e);","                    }","                }","            }","        } \u003cspan class=pl-k\u003ecatch\u003c/span\u003e (\u003cspan class=pl-smi\u003eSQLException\u003c/span\u003e \u003cspan class=pl-s1\u003ee\u003c/span\u003e) {","            \u003cspan class=pl-s1\u003ee\u003c/span\u003e.\u003cspan class=pl-en\u003eprintStackTrace\u003c/span\u003e();","        }","    }","","    \u003cspan class=pl-k\u003eprivate\u003c/span\u003e \u003cspan class=pl-k\u003estatic\u003c/span\u003e \u003cspan class=pl-smi\u003evoid\u003c/span\u003e \u003cspan class=pl-en\u003ecreateDatabase\u003c/span\u003e(\u003cspan class=pl-smi\u003eConnection\u003c/span\u003e \u003cspan class=pl-s1\u003econn\u003c/span\u003e) \u003cspan class=pl-k\u003ethrows\u003c/span\u003e \u003cspan class=pl-smi\u003eSQLException\u003c/span\u003e {","        \u003cspan class=pl-smi\u003eString\u003c/span\u003e \u003cspan class=pl-s1\u003esql\u003c/span\u003e = \u003cspan class=pl-s\u003e\u0026quot;CREATE DATABASE IF NOT EXISTS \u0026quot;\u003c/span\u003e + \u003cspan class=pl-c1\u003eDATABASE_NAME\u003c/span\u003e;","        \u003cspan class=pl-k\u003etry\u003c/span\u003e (\u003cspan class=pl-smi\u003eStatement\u003c/span\u003e \u003cspan class=pl-s1\u003estmt\u003c/span\u003e = \u003cspan class=pl-s1\u003econn\u003c/span\u003e.\u003cspan class=pl-en\u003ecreateStatement\u003c/span\u003e()) {","            \u003cspan class=pl-s1\u003estmt\u003c/span\u003e.\u003cspan class=pl-en\u003eexecuteUpdate\u003c/span\u003e(\u003cspan class=pl-s1\u003esql\u003c/span\u003e);","            \u003cspan class=pl-smi\u003eSystem\u003c/span\u003e.\u003cspan class=pl-s1\u003eout\u003c/span\u003e.\u003cspan class=pl-en\u003eprintln\u003c/span\u003e(\u003cspan class=pl-s\u003e\u0026quot;Database \u0026#39;\u0026quot;\u003c/span\u003e + \u003cspan class=pl-c1\u003eDATABASE_NAME\u003c/span\u003e + \u003cspan class=pl-s\u003e\u0026quot;\u0026#39; created successfully or already exists.\u0026quot;\u003c/span\u003e);","        }","    }","","    \u003cspan class=pl-k\u003eprivate\u003c/span\u003e \u003cspan class=pl-k\u003estatic\u003c/span\u003e \u003cspan class=pl-smi\u003evoid\u003c/span\u003e \u003cspan class=pl-en\u003ecreateTable\u003c/span\u003e(\u003cspan class=pl-smi\u003eConnection\u003c/span\u003e \u003cspan class=pl-s1\u003econn\u003c/span\u003e) \u003cspan class=pl-k\u003ethrows\u003c/span\u003e \u003cspan class=pl-smi\u003eSQLException\u003c/span\u003e {","        \u003cspan class=pl-smi\u003eString\u003c/span\u003e \u003cspan class=pl-s1\u003esql\u003c/span\u003e = \u003cspan class=pl-s\u003e\u0026quot;CREATE TABLE IF NOT EXISTS Courses (\u0026quot;\u003c/span\u003e +","                     \u003cspan class=pl-s\u003e\u0026quot;CourseID INT AUTO_INCREMENT PRIMARY KEY, \u0026quot;\u003c/span\u003e +","                     \u003cspan class=pl-s\u003e\u0026quot;Name VARCHAR(255) NOT NULL, \u0026quot;\u003c/span\u003e +","                     \u003cspan class=pl-s\u003e\u0026quot;Credits INT NOT NULL)\u0026quot;\u003c/span\u003e;","        \u003cspan class=pl-k\u003etry\u003c/span\u003e (\u003cspan class=pl-smi\u003eStatement\u003c/span\u003e \u003cspan class=pl-s1\u003estmt\u003c/span\u003e = \u003cspan class=pl-s1\u003econn\u003c/span\u003e.\u003cspan class=pl-en\u003ecreateStatement\u003c/span\u003e()) {","            \u003cspan class=pl-s1\u003estmt\u003c/span\u003e.\u003cspan class=pl-en\u003eexecuteUpdate\u003c/span\u003e(\u003cspan class=pl-s1\u003esql\u003c/span\u003e);","            \u003cspan class=pl-smi\u003eSystem\u003c/span\u003e.\u003cspan class=pl-s1\u003eout\u003c/span\u003e.\u003cspan class=pl-en\u003eprintln\u003c/span\u003e(\u003cspan class=pl-s\u003e\u0026quot;Table \u0026#39;Courses\u0026#39; created successfully.\u0026quot;\u003c/span\u003e);","        }","    }","","    \u003cspan class=pl-k\u003eprivate\u003c/span\u003e \u003cspan class=pl-k\u003estatic\u003c/span\u003e \u003cspan class=pl-smi\u003evoid\u003c/span\u003e \u003cspan class=pl-en\u003einsertCourse\u003c/span\u003e(\u003cspan class=pl-smi\u003eConnection\u003c/span\u003e \u003cspan class=pl-s1\u003econn\u003c/span\u003e, \u003cspan class=pl-smi\u003eScanner\u003c/span\u003e \u003cspan class=pl-s1\u003escanner\u003c/span\u003e) \u003cspan class=pl-k\u003ethrows\u003c/span\u003e \u003cspan class=pl-smi\u003eSQLException\u003c/span\u003e {","        \u003cspan class=pl-smi\u003eSystem\u003c/span\u003e.\u003cspan class=pl-s1\u003eout\u003c/span\u003e.\u003cspan class=pl-en\u003eprint\u003c/span\u003e(\u003cspan class=pl-s\u003e\u0026quot;Enter Course Name: \u0026quot;\u003c/span\u003e);","        \u003cspan class=pl-smi\u003eString\u003c/span\u003e \u003cspan class=pl-s1\u003ename\u003c/span\u003e = \u003cspan class=pl-s1\u003escanner\u003c/span\u003e.\u003cspan class=pl-en\u003enextLine\u003c/span\u003e();","        \u003cspan class=pl-smi\u003eSystem\u003c/span\u003e.\u003cspan class=pl-s1\u003eout\u003c/span\u003e.\u003cspan class=pl-en\u003eprint\u003c/span\u003e(\u003cspan class=pl-s\u003e\u0026quot;Enter Credits: \u0026quot;\u003c/span\u003e);","        \u003cspan class=pl-smi\u003eint\u003c/span\u003e \u003cspan class=pl-s1\u003ecredits\u003c/span\u003e = \u003cspan class=pl-s1\u003escanner\u003c/span\u003e.\u003cspan class=pl-en\u003enextInt\u003c/span\u003e();","        \u003cspan class=pl-s1\u003escanner\u003c/span\u003e.\u003cspan class=pl-en\u003enextLine\u003c/span\u003e();","","        \u003cspan class=pl-smi\u003eString\u003c/span\u003e \u003cspan class=pl-s1\u003esql\u003c/span\u003e = \u003cspan class=pl-s\u003e\u0026quot;INSERT INTO Courses (Name, Credits) VALUES (?, ?)\u0026quot;\u003c/span\u003e;","        \u003cspan class=pl-k\u003etry\u003c/span\u003e (\u003cspan class=pl-smi\u003ePreparedStatement\u003c/span\u003e \u003cspan class=pl-s1\u003epstmt\u003c/span\u003e = \u003cspan class=pl-s1\u003econn\u003c/span\u003e.\u003cspan class=pl-en\u003eprepareStatement\u003c/span\u003e(\u003cspan class=pl-s1\u003esql\u003c/span\u003e)) {","            \u003cspan class=pl-s1\u003epstmt\u003c/span\u003e.\u003cspan class=pl-en\u003esetString\u003c/span\u003e(\u003cspan class=pl-c1\u003e1\u003c/span\u003e, \u003cspan class=pl-s1\u003ename\u003c/span\u003e);","            \u003cspan class=pl-s1\u003epstmt\u003c/span\u003e.\u003cspan class=pl-en\u003esetInt\u003c/span\u003e(\u003cspan class=pl-c1\u003e2\u003c/span\u003e, \u003cspan class=pl-s1\u003ecredits\u003c/span\u003e);","            \u003cspan class=pl-s1\u003epstmt\u003c/span\u003e.\u003cspan class=pl-en\u003eexecuteUpdate\u003c/span\u003e();","            \u003cspan class=pl-smi\u003eSystem\u003c/span\u003e.\u003cspan class=pl-s1\u003eout\u003c/span\u003e.\u003cspan class=pl-en\u003eprintln\u003c/span\u003e(\u003cspan class=pl-s\u003e\u0026quot;Record inserted successfully.\u0026quot;\u003c/span\u003e);","        }","    }","","    \u003cspan class=pl-k\u003eprivate\u003c/span\u003e \u003cspan class=pl-k\u003estatic\u003c/span\u003e \u003cspan class=pl-smi\u003evoid\u003c/span\u003e \u003cspan class=pl-en\u003eupdateCourse\u003c/span\u003e(\u003cspan class=pl-smi\u003eConnection\u003c/span\u003e \u003cspan class=pl-s1\u003econn\u003c/span\u003e, \u003cspan class=pl-smi\u003eScanner\u003c/span\u003e \u003cspan class=pl-s1\u003escanner\u003c/span\u003e) \u003cspan class=pl-k\u003ethrows\u003c/span\u003e \u003cspan class=pl-smi\u003eSQLException\u003c/span\u003e {","        \u003cspan class=pl-smi\u003eSystem\u003c/span\u003e.\u003cspan class=pl-s1\u003eout\u003c/span\u003e.\u003cspan class=pl-en\u003eprint\u003c/span\u003e(\u003cspan class=pl-s\u003e\u0026quot;Enter CourseID to update: \u0026quot;\u003c/span\u003e);","        \u003cspan class=pl-smi\u003eint\u003c/span\u003e \u003cspan class=pl-s1\u003eid\u003c/span\u003e = \u003cspan class=pl-s1\u003escanner\u003c/span\u003e.\u003cspan class=pl-en\u003enextInt\u003c/span\u003e();","        \u003cspan class=pl-smi\u003eSystem\u003c/span\u003e.\u003cspan class=pl-s1\u003eout\u003c/span\u003e.\u003cspan class=pl-en\u003eprint\u003c/span\u003e(\u003cspan class=pl-s\u003e\u0026quot;Enter new Credits value: \u0026quot;\u003c/span\u003e);","        \u003cspan class=pl-smi\u003eint\u003c/span\u003e \u003cspan class=pl-s1\u003ecredits\u003c/span\u003e = \u003cspan class=pl-s1\u003escanner\u003c/span\u003e.\u003cspan class=pl-en\u003enextInt\u003c/span\u003e();","        \u003cspan class=pl-s1\u003escanner\u003c/span\u003e.\u003cspan class=pl-en\u003enextLine\u003c/span\u003e();","","        \u003cspan class=pl-smi\u003eString\u003c/span\u003e \u003cspan class=pl-s1\u003esql\u003c/span\u003e = \u003cspan class=pl-s\u003e\u0026quot;UPDATE Courses SET Credits = ? WHERE CourseID = ?\u0026quot;\u003c/span\u003e;","        \u003cspan class=pl-k\u003etry\u003c/span\u003e (\u003cspan class=pl-smi\u003ePreparedStatement\u003c/span\u003e \u003cspan class=pl-s1\u003epstmt\u003c/span\u003e = \u003cspan class=pl-s1\u003econn\u003c/span\u003e.\u003cspan class=pl-en\u003eprepareStatement\u003c/span\u003e(\u003cspan class=pl-s1\u003esql\u003c/span\u003e)) {","            \u003cspan class=pl-s1\u003epstmt\u003c/span\u003e.\u003cspan class=pl-en\u003esetInt\u003c/span\u003e(\u003cspan class=pl-c1\u003e1\u003c/span\u003e, \u003cspan class=pl-s1\u003ecredits\u003c/span\u003e);","            \u003cspan class=pl-s1\u003epstmt\u003c/span\u003e.\u003cspan class=pl-en\u003esetInt\u003c/span\u003e(\u003cspan class=pl-c1\u003e2\u003c/span\u003e, \u003cspan class=pl-s1\u003eid\u003c/span\u003e);","            \u003cspan class=pl-smi\u003eint\u003c/span\u003e \u003cspan class=pl-s1\u003erowsUpdated\u003c/span\u003e = \u003cspan class=pl-s1\u003epstmt\u003c/span\u003e.\u003cspan class=pl-en\u003eexecuteUpdate\u003c/span\u003e();","            \u003cspan class=pl-smi\u003eSystem\u003c/span\u003e.\u003cspan class=pl-s1\u003eout\u003c/span\u003e.\u003cspan class=pl-en\u003eprintln\u003c/span\u003e(\u003cspan class=pl-s1\u003erowsUpdated\u003c/span\u003e \u0026gt; \u003cspan class=pl-c1\u003e0\u003c/span\u003e ? \u003cspan class=pl-s\u003e\u0026quot;Record updated successfully.\u0026quot;\u003c/span\u003e : \u003cspan class=pl-s\u003e\u0026quot;CourseID not found.\u0026quot;\u003c/span\u003e);","        }","    }","","    \u003cspan class=pl-k\u003eprivate\u003c/span\u003e \u003cspan class=pl-k\u003estatic\u003c/span\u003e \u003cspan class=pl-smi\u003evoid\u003c/span\u003e \u003cspan class=pl-en\u003edeleteCourse\u003c/span\u003e(\u003cspan class=pl-smi\u003eConnection\u003c/span\u003e \u003cspan class=pl-s1\u003econn\u003c/span\u003e, \u003cspan class=pl-smi\u003eScanner\u003c/span\u003e \u003cspan class=pl-s1\u003escanner\u003c/span\u003e) \u003cspan class=pl-k\u003ethrows\u003c/span\u003e \u003cspan class=pl-smi\u003eSQLException\u003c/span\u003e {","        \u003cspan class=pl-smi\u003eSystem\u003c/span\u003e.\u003cspan class=pl-s1\u003eout\u003c/span\u003e.\u003cspan class=pl-en\u003eprint\u003c/span\u003e(\u003cspan class=pl-s\u003e\u0026quot;Enter CourseID to delete: \u0026quot;\u003c/span\u003e);","        \u003cspan class=pl-smi\u003eint\u003c/span\u003e \u003cspan class=pl-s1\u003eid\u003c/span\u003e = \u003cspan class=pl-s1\u003escanner\u003c/span\u003e.\u003cspan class=pl-en\u003enextInt\u003c/span\u003e();","        \u003cspan class=pl-s1\u003escanner\u003c/span\u003e.\u003cspan class=pl-en\u003enextLine\u003c/span\u003e();","","        \u003cspan class=pl-smi\u003eString\u003c/span\u003e \u003cspan class=pl-s1\u003esql\u003c/span\u003e = \u003cspan class=pl-s\u003e\u0026quot;DELETE FROM Courses WHERE CourseID = ?\u0026quot;\u003c/span\u003e;","        \u003cspan class=pl-k\u003etry\u003c/span\u003e (\u003cspan class=pl-smi\u003ePreparedStatement\u003c/span\u003e \u003cspan class=pl-s1\u003epstmt\u003c/span\u003e = \u003cspan class=pl-s1\u003econn\u003c/span\u003e.\u003cspan class=pl-en\u003eprepareStatement\u003c/span\u003e(\u003cspan class=pl-s1\u003esql\u003c/span\u003e)) {","            \u003cspan class=pl-s1\u003epstmt\u003c/span\u003e.\u003cspan class=pl-en\u003esetInt\u003c/span\u003e(\u003cspan class=pl-c1\u003e1\u003c/span\u003e, \u003cspan class=pl-s1\u003eid\u003c/span\u003e);","            \u003cspan class=pl-smi\u003eint\u003c/span\u003e \u003cspan class=pl-s1\u003erowsDeleted\u003c/span\u003e = \u003cspan class=pl-s1\u003epstmt\u003c/span\u003e.\u003cspan class=pl-en\u003eexecuteUpdate\u003c/span\u003e();","            \u003cspan class=pl-smi\u003eSystem\u003c/span\u003e.\u003cspan class=pl-s1\u003eout\u003c/span\u003e.\u003cspan class=pl-en\u003eprintln\u003c/span\u003e(\u003cspan class=pl-s1\u003erowsDeleted\u003c/span\u003e \u0026gt; \u003cspan class=pl-c1\u003e0\u003c/span\u003e ? \u003cspan class=pl-s\u003e\u0026quot;Record deleted successfully.\u0026quot;\u003c/span\u003e : \u003cspan class=pl-s\u003e\u0026quot;CourseID not found.\u0026quot;\u003c/span\u003e);","        }","    }","","    \u003cspan class=pl-k\u003eprivate\u003c/span\u003e \u003cspan class=pl-k\u003estatic\u003c/span\u003e \u003cspan class=pl-smi\u003evoid\u003c/span\u003e \u003cspan class=pl-en\u003edisplayCourses\u003c/span\u003e(\u003cspan class=pl-smi\u003eConnection\u003c/span\u003e \u003cspan class=pl-s1\u003econn\u003c/span\u003e) \u003cspan class=pl-k\u003ethrows\u003c/span\u003e \u003cspan class=pl-smi\u003eSQLException\u003c/span\u003e {","        \u003cspan class=pl-smi\u003eString\u003c/span\u003e \u003cspan class=pl-s1\u003esql\u003c/span\u003e = \u003cspan class=pl-s\u003e\u0026quot;SELECT * FROM Courses\u0026quot;\u003c/span\u003e;","        \u003cspan class=pl-k\u003etry\u003c/span\u003e (\u003cspan class=pl-smi\u003eStatement\u003c/span\u003e \u003cspan class=pl-s1\u003estmt\u003c/span\u003e = \u003cspan class=pl-s1\u003econn\u003c/span\u003e.\u003cspan class=pl-en\u003ecreateStatement\u003c/span\u003e(); \u003cspan class=pl-smi\u003eResultSet\u003c/span\u003e \u003cspan class=pl-s1\u003ers\u003c/span\u003e = \u003cspan class=pl-s1\u003estmt\u003c/span\u003e.\u003cspan class=pl-en\u003eexecuteQuery\u003c/span\u003e(\u003cspan class=pl-s1\u003esql\u003c/span\u003e)) {","            \u003cspan class=pl-smi\u003eSystem\u003c/span\u003e.\u003cspan class=pl-s1\u003eout\u003c/span\u003e.\u003cspan class=pl-en\u003eprintln\u003c/span\u003e(\u003cspan class=pl-s\u003e\u0026quot;Courses Table Records:\u0026quot;\u003c/span\u003e);","            \u003cspan class=pl-smi\u003eSystem\u003c/span\u003e.\u003cspan class=pl-s1\u003eout\u003c/span\u003e.\u003cspan class=pl-en\u003eprintln\u003c/span\u003e(\u003cspan class=pl-s\u003e\u0026quot;-----------------------------------------\u0026quot;\u003c/span\u003e);","            \u003cspan class=pl-k\u003ewhile\u003c/span\u003e (\u003cspan class=pl-s1\u003ers\u003c/span\u003e.\u003cspan class=pl-en\u003enext\u003c/span\u003e()) {","                \u003cspan class=pl-smi\u003eSystem\u003c/span\u003e.\u003cspan class=pl-s1\u003eout\u003c/span\u003e.\u003cspan class=pl-en\u003eprintln\u003c/span\u003e(\u003cspan class=pl-s\u003e\u0026quot;CourseID: \u0026quot;\u003c/span\u003e + \u003cspan class=pl-s1\u003ers\u003c/span\u003e.\u003cspan class=pl-en\u003egetInt\u003c/span\u003e(\u003cspan class=pl-s\u003e\u0026quot;CourseID\u0026quot;\u003c/span\u003e) + \u003cspan class=pl-s\u003e\u0026quot; | Name: \u0026quot;\u003c/span\u003e + \u003cspan class=pl-s1\u003ers\u003c/span\u003e.\u003cspan class=pl-en\u003egetString\u003c/span\u003e(\u003cspan class=pl-s\u003e\u0026quot;Name\u0026quot;\u003c/span\u003e) + \u003cspan class=pl-s\u003e\u0026quot; | Credits: \u0026quot;\u003c/span\u003e + \u003cspan class=pl-s1\u003ers\u003c/span\u003e.\u003cspan class=pl-en\u003egetInt\u003c/span\u003e(\u003cspan class=pl-s\u003e\u0026quot;Credits\u0026quot;\u003c/span\u003e));","            }","        }","    }","}"],"csv":null,"csvError":null,"dependabotInfo":{"showConfigurationBanner":false,"configFilePath":null,"networkDependabotPath":"/AmirishettyAkhila/web-technologies2025/network/updates","dismissConfigurationNoticePath":"/settings/dismiss-notice/dependabot_configuration_notice","configurationNoticeDismissed":false},"displayName":"CollegeManagementSystem.java","displayUrl":"https://github.com/AmirishettyAkhila/web-technologies2025/blob/main/CollegeManagementSystem.java?raw=true","headerInfo":{"blobSize":"5.1 KB","deleteTooltip":"Fork this repository and delete the file","editTooltip":"Fork this repository and edit the file","ghDesktopPath":"https://desktop.github.com","isGitLfs":false,"onBranch":true,"shortPath":"3e175c5","siteNavLoginPath":"/login?return_to=https%3A%2F%2Fgithub.com%2FAmirishettyAkhila%2Fweb-technologies2025%2Fblob%2Fmain%2FCollegeManagementSystem.java","isCSV":false,"isRichtext":false,"toc":null,"lineInfo":{"truncatedLoc":"123","truncatedSloc":"109"},"mode":"file"},"image":false,"isCodeownersFile":null,"isPlain":false,"isValidLegacyIssueTemplate":false,"issueTemplate":null,"discussionTemplate":null,"language":"Java","languageID":181,"large":false,"planSupportInfo":{"repoIsFork":null,"repoOwnedByCurrentUser":null,"requestFullPath":"/AmirishettyAkhila/web-technologies2025/blob/main/CollegeManagementSystem.java","showFreeOrgGatedFeatureMessage":null,"showPlanSupportBanner":null,"upgradeDataAttributes":null,"upgradePath":null},"publishBannersInfo":{"dismissActionNoticePath":"/settings/dismiss-notice/publish_action_from_dockerfile","releasePath":"/AmirishettyAkhila/web-technologies2025/releases/new?marketplace=true","showPublishActionBanner":false},"rawBlobUrl":"https://github.com/AmirishettyAkhila/web-technologies2025/raw/refs/heads/main/CollegeManagementSystem.java","renderImageOrRaw":false,"richText":null,"renderedFileInfo":null,"shortPath":null,"symbolsEnabled":true,"tabSize":8,"topBannersInfo":{"overridingGlobalFundingFile":false,"globalPreferredFundingPath":null,"showInvalidCitationWarning":false,"citationHelpUrl":"https://docs.github.com/github/creating-cloning-and-archiving-repositories/creating-a-repository-on-github/about-citation-files","actionsOnboardingTip":null},"truncated":false,"viewable":true,"workflowRedirectUrl":null,"symbols":{"timed_out":false,"not_analyzed":false,"symbols":[{"name":"CollegeManagementSystem","kind":"class","ident_start":59,"ident_end":82,"extent_start":46,"extent_end":5218,"fully_qualified_name":"CollegeManagementSystem","ident_utf16":{"start":{"line_number":3,"utf16_col":13},"end":{"line_number":3,"utf16_col":36}},"extent_utf16":{"start":{"line_number":3,"utf16_col":0},"end":{"line_number":122,"utf16_col":1}}},{"name":"DATABASE_URL","kind":"field","ident_start":117,"ident_end":129,"extent_start":89,"extent_end":163,"fully_qualified_name":"CollegeManagementSystem::DATABASE_URL","ident_utf16":{"start":{"line_number":4,"utf16_col":32},"end":{"line_number":4,"utf16_col":44}},"extent_utf16":{"start":{"line_number":4,"utf16_col":4},"end":{"line_number":4,"utf16_col":78}}},{"name":"DATABASE_NAME","kind":"field","ident_start":196,"ident_end":209,"extent_start":168,"extent_end":224,"fully_qualified_name":"CollegeManagementSystem::DATABASE_NAME","ident_utf16":{"start":{"line_number":5,"utf16_col":32},"end":{"line_number":5,"utf16_col":45}},"extent_utf16":{"start":{"line_number":5,"utf16_col":4},"end":{"line_number":5,"utf16_col":60}}},{"name":"USER","kind":"field","ident_start":257,"ident_end":261,"extent_start":229,"extent_end":271,"fully_qualified_name":"CollegeManagementSystem::USER","ident_utf16":{"start":{"line_number":6,"utf16_col":32},"end":{"line_number":6,"utf16_col":36}},"extent_utf16":{"start":{"line_number":6,"utf16_col":4},"end":{"line_number":6,"utf16_col":46}}},{"name":"PASSWORD","kind":"field","ident_start":304,"ident_end":312,"extent_start":276,"extent_end":323,"fully_qualified_name":"CollegeManagementSystem::PASSWORD","ident_utf16":{"start":{"line_number":7,"utf16_col":32},"end":{"line_number":7,"utf16_col":40}},"extent_utf16":{"start":{"line_number":7,"utf16_col":4},"end":{"line_number":7,"utf16_col":51}}},{"name":"main","kind":"method","ident_start":348,"ident_end":352,"extent_start":329,"extent_end":1904,"fully_qualified_name":"CollegeManagementSystem::main","ident_utf16":{"start":{"line_number":9,"utf16_col":23},"end":{"line_number":9,"utf16_col":27}},"extent_utf16":{"start":{"line_number":9,"utf16_col":4},"end":{"line_number":46,"utf16_col":5}}},{"name":"createDatabase","kind":"method","ident_start":1930,"ident_end":1944,"extent_start":1910,"extent_end":2271,"fully_qualified_name":"CollegeManagementSystem::createDatabase","ident_utf16":{"start":{"line_number":48,"utf16_col":24},"end":{"line_number":48,"utf16_col":38}},"extent_utf16":{"start":{"line_number":48,"utf16_col":4},"end":{"line_number":54,"utf16_col":5}}},{"name":"createTable","kind":"method","ident_start":2297,"ident_end":2308,"extent_start":2277,"extent_end":2758,"fully_qualified_name":"CollegeManagementSystem::createTable","ident_utf16":{"start":{"line_number":56,"utf16_col":24},"end":{"line_number":56,"utf16_col":35}},"extent_utf16":{"start":{"line_number":56,"utf16_col":4},"end":{"line_number":65,"utf16_col":5}}},{"name":"insertCourse","kind":"method","ident_start":2784,"ident_end":2796,"extent_start":2764,"extent_end":3393,"fully_qualified_name":"CollegeManagementSystem::insertCourse","ident_utf16":{"start":{"line_number":67,"utf16_col":24},"end":{"line_number":67,"utf16_col":36}},"extent_utf16":{"start":{"line_number":67,"utf16_col":4},"end":{"line_number":81,"utf16_col":5}}},{"name":"updateCourse","kind":"method","ident_start":3419,"ident_end":3431,"extent_start":3399,"extent_end":4093,"fully_qualified_name":"CollegeManagementSystem::updateCourse","ident_utf16":{"start":{"line_number":83,"utf16_col":24},"end":{"line_number":83,"utf16_col":36}},"extent_utf16":{"start":{"line_number":83,"utf16_col":4},"end":{"line_number":97,"utf16_col":5}}},{"name":"deleteCourse","kind":"method","ident_start":4119,"ident_end":4131,"extent_start":4099,"extent_end":4648,"fully_qualified_name":"CollegeManagementSystem::deleteCourse","ident_utf16":{"start":{"line_number":99,"utf16_col":24},"end":{"line_number":99,"utf16_col":36}},"extent_utf16":{"start":{"line_number":99,"utf16_col":4},"end":{"line_number":110,"utf16_col":5}}},{"name":"displayCourses","kind":"method","ident_start":4674,"ident_end":4688,"extent_start":4654,"extent_end":5216,"fully_qualified_name":"CollegeManagementSystem::displayCourses","ident_utf16":{"start":{"line_number":112,"utf16_col":24},"end":{"line_number":112,"utf16_col":38}},"extent_utf16":{"start":{"line_number":112,"utf16_col":4},"end":{"line_number":121,"utf16_col":5}}}]}},"copilotInfo":null,"copilotAccessAllowed":true,"modelsAccessAllowed":false,"csrf_tokens":{"/AmirishettyAkhila/web-technologies2025/branches":{"post":"t4-ex1d748fOZQ2CbCHyLI5XnAPZOGoRqD9xGP_JrRyriViIiMLjMsfKW9ivKN_YpuWhwcwNWX1akCoWOOICUA"},"/repos/preferences":{"post":"zgbI1kColvx_tw2i6_fv85SH2kBGYx0KVx_X0nwDWqVPPSuERmCZvxCqISgm1wVQZOJm6ngHO8iVo-znvfGWJw"}}},"title":"web-technologies2025/CollegeManagementSystem.java at main · AmirishettyAkhila/web-technologies2025","appPayload":{"helpUrl":"https://docs.github.com","findFileWorkerPath":"/assets-cdn/worker/find-file-worker-9f8a877aa99f.js","findInFileWorkerPath":"/assets-cdn/worker/find-in-file-worker-96e76d5fdb2c.js","githubDevUrl":"https://github.dev/","enabled_features":{"code_nav_ui_events":false,"overview_shared_code_dropdown_button":false,"react_blob_overlay":true,"copilot_conversational_ux_embedding_update":false,"copilot_smell_icebreaker_ux":true,"accessible_code_button":true}}}</script>
  <div data-target="react-app.reactRoot"><meta data-hydrostats="publish"> <!-- --> <!-- --> <button hidden="" data-testid="header-permalink-button" data-hotkey-scope="read-only-cursor-text-area" data-hotkey="y,Shift+Y"></button><button hidden="" data-hotkey="y,Shift+Y"></button><div><div style="--sticky-pane-height: calc(100vh - (max(104px, 0px))); --spacing: var(--spacing-none);" class="Box-sc-g0xbh4-0 hOfjFo"><div class="Box-sc-g0xbh4-0 oDGAe"><div class="Box-sc-g0xbh4-0 kowOcT"><div tabindex="0" class="Box-sc-g0xbh4-0 gISSDQ"><div class="Box-sc-g0xbh4-0 cMnVPV"><div class="Box-sc-g0xbh4-0 hPvFuC"></div><div style="--pane-width:320px" class="Box-sc-g0xbh4-0 fFSoPl"><div><div id="repos-file-tree" class="Box-sc-g0xbh4-0 bNhwaa"><div class="Box-sc-g0xbh4-0 hNNCwk"><div class="Box-sc-g0xbh4-0 jfIeyl"><h2 class="Box-sc-g0xbh4-0 XosP prc-Heading-Heading-6CmGO"><span role="tooltip" aria-label="Collapse file tree" id="expand-button-file-tree-button" class="Tooltip__TooltipBase-sc-17tf59c-0 hWlpPn tooltipped-se"><button data-component="IconButton" type="button" data-testid="collapse-file-tree-button" aria-expanded="true" aria-controls="repos-file-tree" class="prc-Button-ButtonBase-c50BI position-relative ExpandFileTreeButton-module__expandButton--gL4is fgColor-muted prc-Button-IconButton-szpyj" data-loading="false" data-no-visuals="true" data-size="medium" data-variant="invisible" aria-describedby=":R356mplab:-loading-announcement" aria-labelledby="expand-button-file-tree-button" data-hotkey="Control+b"><svg aria-hidden="true" focusable="false" class="octicon octicon-sidebar-expand" viewBox="0 0 16 16" width="16" height="16" fill="currentColor" style="display:inline-block;user-select:none;vertical-align:text-bottom;overflow:visible"><path d="m4.177 7.823 2.396-2.396A.25.25 0 0 1 7 5.604v4.792a.25.25 0 0 1-.427.177L4.177 8.177a.25.25 0 0 1 0-.354Z"></path><path d="M0 1.75C0 .784.784 0 1.75 0h12.5C15.216 0 16 .784 16 1.75v12.5A1.75 1.75 0 0 1 14.25 16H1.75A1.75 1.75 0 0 1 0 14.25Zm1.75-.25a.25.25 0 0 0-.25.25v12.5c0 .138.112.25.25.25H9.5v-13Zm12.5 13a.25.25 0 0 0 .25-.25V1.75a.25.25 0 0 0-.25-.25H11v13Z"></path></svg></button></span><button hidden="" data-testid="" data-hotkey-scope="read-only-cursor-text-area" data-hotkey="Control+b"></button></h2><h2 class="Box-sc-g0xbh4-0 kOkWgo prc-Heading-Heading-6CmGO">Files</h2></div><div class="Box-sc-g0xbh4-0 lhbroM"><div class="Box-sc-g0xbh4-0 khzwtX"><button type="button" aria-haspopup="true" aria-expanded="false" tabindex="0" aria-label="main branch" data-testid="anchor-button" class="Box-sc-g0xbh4-0 gMOVLe prc-Button-ButtonBase-c50BI react-repos-tree-pane-ref-selector width-full ref-selector-class" data-loading="false" data-size="medium" data-variant="default" aria-describedby="branch-picker-repos-header-ref-selector-loading-announcement" id="branch-picker-repos-header-ref-selector" data-hotkey="w"><span data-component="buttonContent" class="Box-sc-g0xbh4-0 gUkoLg prc-Button-ButtonContent-HKbr-"><span data-component="text" class="prc-Button-Label-pTQ3x"><div class="Box-sc-g0xbh4-0 bZBlpz"><div class="Box-sc-g0xbh4-0 lhTYNA"><svg aria-hidden="true" focusable="false" class="octicon octicon-git-branch" viewBox="0 0 16 16" width="16" height="16" fill="currentColor" style="display:inline-block;user-select:none;vertical-align:text-bottom;overflow:visible"><path d="M9.5 3.25a2.25 2.25 0 1 1 3 2.122V6A2.5 2.5 0 0 1 10 8.5H6a1 1 0 0 0-1 1v1.128a2.251 2.251 0 1 1-1.5 0V5.372a2.25 2.25 0 1 1 1.5 0v1.836A2.493 2.493 0 0 1 6 7h4a1 1 0 0 0 1-1v-.628A2.25 2.25 0 0 1 9.5 3.25Zm-6 0a.75.75 0 1 0 1.5 0 .75.75 0 0 0-1.5 0Zm8.25-.75a.75.75 0 1 0 0 1.5.75.75 0 0 0 0-1.5ZM4.25 12a.75.75 0 1 0 0 1.5.75.75 0 0 0 0-1.5Z"></path></svg></div><div class="Box-sc-g0xbh4-0 ffLUq ref-selector-button-text-container"><span class="Text__StyledText-sc-17v1xeu-0 eMMFM">&nbsp;<!-- -->main</span></div></div></span><span data-component="trailingVisual" class="prc-Button-Visual-2epfX prc-Button-VisualWrap-Db-eB"><svg aria-hidden="true" focusable="false" class="octicon octicon-triangle-down" viewBox="0 0 16 16" width="16" height="16" fill="currentColor" style="display:inline-block;user-select:none;vertical-align:text-bottom;overflow:visible"><path d="m4.427 7.427 3.396 3.396a.25.25 0 0 0 .354 0l3.396-3.396A.25.25 0 0 0 11.396 7H4.604a.25.25 0 0 0-.177.427Z"></path></svg></span></span></button><button hidden="" data-hotkey-scope="read-only-cursor-text-area" data-hotkey="w"></button></div><div class="Box-sc-g0xbh4-0 eTeVqd"><a sx="[object Object]" data-component="IconButton" type="button" aria-label="Add file" class="Box-sc-g0xbh4-0 fhbevO prc-Button-ButtonBase-c50BI prc-Button-IconButton-szpyj" data-loading="false" data-no-visuals="true" data-size="medium" data-variant="default" aria-describedby=":R6q6mplab:-loading-announcement :Rq6mplab:" href="https://github.com/AmirishettyAkhila/web-technologies2025/new/main"><svg aria-hidden="true" focusable="false" class="octicon octicon-plus" viewBox="0 0 16 16" width="16" height="16" fill="currentColor" style="display:inline-block;user-select:none;vertical-align:text-bottom;overflow:visible"><path d="M7.75 2a.75.75 0 0 1 .75.75V7h4.25a.75.75 0 0 1 0 1.5H8.5v4.25a.75.75 0 0 1-1.5 0V8.5H2.75a.75.75 0 0 1 0-1.5H7V2.75A.75.75 0 0 1 7.75 2Z"></path></svg></a><span class="Tooltip__StyledTooltip-sc-e45c7z-0 jOyaRH" data-direction="s" aria-label="Add file" role="tooltip" aria-hidden="true" id=":Rq6mplab:" popover="auto">Add file</span><button data-component="IconButton" type="button" aria-label="Search this repository" class="Box-sc-g0xbh4-0 fCjIQM prc-Button-ButtonBase-c50BI prc-Button-IconButton-szpyj" data-loading="false" data-no-visuals="true" data-size="medium" data-variant="default" aria-describedby=":R3a6mplab:-loading-announcement" data-hotkey="/"><svg aria-hidden="true" focusable="false" class="octicon octicon-search" viewBox="0 0 16 16" width="16" height="16" fill="currentColor" style="display:inline-block;user-select:none;vertical-align:text-bottom;overflow:visible"><path d="M10.68 11.74a6 6 0 0 1-7.922-8.982 6 6 0 0 1 8.982 7.922l3.04 3.04a.749.749 0 0 1-.326 1.275.749.749 0 0 1-.734-.215ZM11.5 7a4.499 4.499 0 1 0-8.997 0A4.499 4.499 0 0 0 11.5 7Z"></path></svg></button><button hidden="" data-testid="" data-hotkey-scope="read-only-cursor-text-area" data-hotkey="/"></button></div></div></div><div class="Box-sc-g0xbh4-0 qkmJR"><span class="TextInputWrapper__StyledTextInputBaseWrapper-sc-1mqhpbi-0 hLzFvi TextInputWrapper__StyledTextInputWrapper-sc-1mqhpbi-1 iHYdQq TextInput-wrapper" data-leading-visual="true" data-trailing-visual="true" aria-busy="false"><span class="TextInput-icon" id=":R5amplab:" aria-hidden="true"><svg aria-hidden="true" focusable="false" class="octicon octicon-search" viewBox="0 0 16 16" width="16" height="16" fill="currentColor" style="display:inline-block;user-select:none;vertical-align:text-bottom;overflow:visible"><path d="M10.68 11.74a6 6 0 0 1-7.922-8.982 6 6 0 0 1 8.982 7.922l3.04 3.04a.749.749 0 0 1-.326 1.275.749.749 0 0 1-.734-.215ZM11.5 7a4.499 4.499 0 1 0-8.997 0A4.499 4.499 0 0 0 11.5 7Z"></path></svg></span><input type="text" aria-label="Go to file" role="combobox" aria-controls="file-results-list" aria-expanded="false" aria-haspopup="dialog" autocorrect="off" spellcheck="false" placeholder="Go to file" aria-describedby=":R5amplab: :R5amplabH1:" data-component="input" class="UnstyledTextInput__ToggledUnstyledTextInput-sc-14ypya-0 jkNcAv" value=""><span class="TextInput-icon" id=":R5amplabH1:" aria-hidden="true"><div class="Box-sc-g0xbh4-0 dItACB"><kbd>t</kbd></div></span></span></div><button hidden="" data-testid="" data-hotkey-scope="read-only-cursor-text-area" data-hotkey="t,Shift+T"></button><button hidden="" data-hotkey="t,Shift+T"></button><div class="Box-sc-g0xbh4-0 jbQqON"><div><div class="react-tree-show-tree-items"><div data-testid="repos-file-tree-container" class="Box-sc-g0xbh4-0 cOxzdh"><nav aria-label="File Tree Navigation"><span role="status" aria-live="polite" aria-atomic="true" class="_VisuallyHidden__VisuallyHidden-sc-11jhm7a-0 brGdpi"></span><ul role="tree" aria-label="Files" data-truncate-text="true" class="TreeView__UlBox-sc-4ex6b6-0 jgdSGi"><li class="PRIVATE_TreeView-item" tabindex="0" id="CollegeManagementSystem.java-item" role="treeitem" aria-labelledby=":r3v:" aria-describedby=":r40:" aria-level="1" aria-current="true" aria-selected="true"><div class="PRIVATE_TreeView-item-container" style="--level: 1;"><div style="grid-area: spacer; display: flex;"><div style="width: 100%; display: flex;"></div></div><div id=":r3v:" class="PRIVATE_TreeView-item-content"><div class="PRIVATE_VisuallyHidden" aria-hidden="true" id=":r40:"></div><div class="PRIVATE_TreeView-item-visual" aria-hidden="true"><svg aria-hidden="true" focusable="false" class="octicon octicon-file" viewBox="0 0 16 16" width="16" height="16" fill="currentColor" style="display: inline-block; user-select: none; vertical-align: text-bottom; overflow: visible;"><path d="M2 1.75C2 .784 2.784 0 3.75 0h6.586c.464 0 .909.184 1.237.513l2.914 2.914c.329.328.513.773.513 1.237v9.586A1.75 1.75 0 0 1 13.25 16h-9.5A1.75 1.75 0 0 1 2 14.25Zm1.75-.25a.25.25 0 0 0-.25.25v12.5c0 .138.112.25.25.25h9.5a.25.25 0 0 0 .25-.25V6h-2.75A1.75 1.75 0 0 1 9 4.25V1.5Zm6.75.062V4.25c0 .138.112.25.25.25h2.688l-.011-.013-2.914-2.914-.013-.011Z"></path></svg></div><span class="PRIVATE_TreeView-item-content-text"><span>CollegeManagementSystem.java</span></span></div></div></li><li class="PRIVATE_TreeView-item" tabindex="-1" id="Database Details.txt-item" role="treeitem" aria-labelledby=":r42:" aria-describedby=":r43:" aria-level="1" aria-selected="false"><div class="PRIVATE_TreeView-item-container" style="--level: 1; content-visibility: auto; contain-intrinsic-size: auto 2rem;"><div style="grid-area: spacer; display: flex;"><div style="width: 100%; display: flex;"></div></div><div id=":r42:" class="PRIVATE_TreeView-item-content"><div class="PRIVATE_VisuallyHidden" aria-hidden="true" id=":r43:"></div><div class="PRIVATE_TreeView-item-visual" aria-hidden="true"><svg aria-hidden="true" focusable="false" class="octicon octicon-file" viewBox="0 0 16 16" width="16" height="16" fill="currentColor" style="display: inline-block; user-select: none; vertical-align: text-bottom; overflow: visible;"><path d="M2 1.75C2 .784 2.784 0 3.75 0h6.586c.464 0 .909.184 1.237.513l2.914 2.914c.329.328.513.773.513 1.237v9.586A1.75 1.75 0 0 1 13.25 16h-9.5A1.75 1.75 0 0 1 2 14.25Zm1.75-.25a.25.25 0 0 0-.25.25v12.5c0 .138.112.25.25.25h9.5a.25.25 0 0 0 .25-.25V6h-2.75A1.75 1.75 0 0 1 9 4.25V1.5Zm6.75.062V4.25c0 .138.112.25.25.25h2.688l-.011-.013-2.914-2.914-.013-.011Z"></path></svg></div><span class="PRIVATE_TreeView-item-content-text"><span>Database Details.txt</span></span></div></div></li><li class="PRIVATE_TreeView-item" tabindex="-1" id="StudentManagementSystem.java-item" role="treeitem" aria-labelledby=":r45:" aria-describedby=":r46:" aria-level="1" aria-selected="false"><div class="PRIVATE_TreeView-item-container" style="--level: 1; content-visibility: auto; contain-intrinsic-size: auto 2rem;"><div style="grid-area: spacer; display: flex;"><div style="width: 100%; display: flex;"></div></div><div id=":r45:" class="PRIVATE_TreeView-item-content"><div class="PRIVATE_VisuallyHidden" aria-hidden="true" id=":r46:"></div><div class="PRIVATE_TreeView-item-visual" aria-hidden="true"><svg aria-hidden="true" focusable="false" class="octicon octicon-file" viewBox="0 0 16 16" width="16" height="16" fill="currentColor" style="display: inline-block; user-select: none; vertical-align: text-bottom; overflow: visible;"><path d="M2 1.75C2 .784 2.784 0 3.75 0h6.586c.464 0 .909.184 1.237.513l2.914 2.914c.329.328.513.773.513 1.237v9.586A1.75 1.75 0 0 1 13.25 16h-9.5A1.75 1.75 0 0 1 2 14.25Zm1.75-.25a.25.25 0 0 0-.25.25v12.5c0 .138.112.25.25.25h9.5a.25.25 0 0 0 .25-.25V6h-2.75A1.75 1.75 0 0 1 9 4.25V1.5Zm6.75.062V4.25c0 .138.112.25.25.25h2.688l-.011-.013-2.914-2.914-.013-.011Z"></path></svg></div><span class="PRIVATE_TreeView-item-content-text"><span>StudentManagementSystem.java</span></span></div></div></li><li class="PRIVATE_TreeView-item" tabindex="-1" id="finance.html-item" role="treeitem" aria-labelledby=":r48:" aria-describedby=":r49:" aria-level="1" aria-selected="false"><div class="PRIVATE_TreeView-item-container" style="--level: 1; content-visibility: auto; contain-intrinsic-size: auto 2rem;"><div style="grid-area: spacer; display: flex;"><div style="width: 100%; display: flex;"></div></div><div id=":r48:" class="PRIVATE_TreeView-item-content"><div class="PRIVATE_VisuallyHidden" aria-hidden="true" id=":r49:"></div><div class="PRIVATE_TreeView-item-visual" aria-hidden="true"><svg aria-hidden="true" focusable="false" class="octicon octicon-file" viewBox="0 0 16 16" width="16" height="16" fill="currentColor" style="display: inline-block; user-select: none; vertical-align: text-bottom; overflow: visible;"><path d="M2 1.75C2 .784 2.784 0 3.75 0h6.586c.464 0 .909.184 1.237.513l2.914 2.914c.329.328.513.773.513 1.237v9.586A1.75 1.75 0 0 1 13.25 16h-9.5A1.75 1.75 0 0 1 2 14.25Zm1.75-.25a.25.25 0 0 0-.25.25v12.5c0 .138.112.25.25.25h9.5a.25.25 0 0 0 .25-.25V6h-2.75A1.75 1.75 0 0 1 9 4.25V1.5Zm6.75.062V4.25c0 .138.112.25.25.25h2.688l-.011-.013-2.914-2.914-.013-.011Z"></path></svg></div><span class="PRIVATE_TreeView-item-content-text"><span>finance.html</span></span></div></div></li><li class="PRIVATE_TreeView-item" tabindex="-1" id="movie.html-item" role="treeitem" aria-labelledby=":r4b:" aria-describedby=":r4c:" aria-level="1" aria-selected="false"><div class="PRIVATE_TreeView-item-container" style="--level: 1; content-visibility: auto; contain-intrinsic-size: auto 2rem;"><div style="grid-area: spacer; display: flex;"><div style="width: 100%; display: flex;"></div></div><div id=":r4b:" class="PRIVATE_TreeView-item-content"><div class="PRIVATE_VisuallyHidden" aria-hidden="true" id=":r4c:"></div><div class="PRIVATE_TreeView-item-visual" aria-hidden="true"><svg aria-hidden="true" focusable="false" class="octicon octicon-file" viewBox="0 0 16 16" width="16" height="16" fill="currentColor" style="display: inline-block; user-select: none; vertical-align: text-bottom; overflow: visible;"><path d="M2 1.75C2 .784 2.784 0 3.75 0h6.586c.464 0 .909.184 1.237.513l2.914 2.914c.329.328.513.773.513 1.237v9.586A1.75 1.75 0 0 1 13.25 16h-9.5A1.75 1.75 0 0 1 2 14.25Zm1.75-.25a.25.25 0 0 0-.25.25v12.5c0 .138.112.25.25.25h9.5a.25.25 0 0 0 .25-.25V6h-2.75A1.75 1.75 0 0 1 9 4.25V1.5Zm6.75.062V4.25c0 .138.112.25.25.25h2.688l-.011-.013-2.914-2.914-.013-.011Z"></path></svg></div><span class="PRIVATE_TreeView-item-content-text"><span>movie.html</span></span></div></div></li><li class="PRIVATE_TreeView-item" tabindex="-1" id="registration.html-item" role="treeitem" aria-labelledby=":r4e:" aria-describedby=":r4f:" aria-level="1" aria-selected="false"><div class="PRIVATE_TreeView-item-container" style="--level: 1; content-visibility: auto; contain-intrinsic-size: auto 2rem;"><div style="grid-area: spacer; display: flex;"><div style="width: 100%; display: flex;"></div></div><div id=":r4e:" class="PRIVATE_TreeView-item-content"><div class="PRIVATE_VisuallyHidden" aria-hidden="true" id=":r4f:"></div><div class="PRIVATE_TreeView-item-visual" aria-hidden="true"><svg aria-hidden="true" focusable="false" class="octicon octicon-file" viewBox="0 0 16 16" width="16" height="16" fill="currentColor" style="display: inline-block; user-select: none; vertical-align: text-bottom; overflow: visible;"><path d="M2 1.75C2 .784 2.784 0 3.75 0h6.586c.464 0 .909.184 1.237.513l2.914 2.914c.329.328.513.773.513 1.237v9.586A1.75 1.75 0 0 1 13.25 16h-9.5A1.75 1.75 0 0 1 2 14.25Zm1.75-.25a.25.25 0 0 0-.25.25v12.5c0 .138.112.25.25.25h9.5a.25.25 0 0 0 .25-.25V6h-2.75A1.75 1.75 0 0 1 9 4.25V1.5Zm6.75.062V4.25c0 .138.112.25.25.25h2.688l-.011-.013-2.914-2.914-.013-.011Z"></path></svg></div><span class="PRIVATE_TreeView-item-content-text"><span>registration.html</span></span></div></div></li><li class="PRIVATE_TreeView-item" tabindex="-1" id="store.html-item" role="treeitem" aria-labelledby=":r4h:" aria-describedby=":r4i:" aria-level="1" aria-selected="false"><div class="PRIVATE_TreeView-item-container" style="--level: 1; content-visibility: auto; contain-intrinsic-size: auto 2rem;"><div style="grid-area: spacer; display: flex;"><div style="width: 100%; display: flex;"></div></div><div id=":r4h:" class="PRIVATE_TreeView-item-content"><div class="PRIVATE_VisuallyHidden" aria-hidden="true" id=":r4i:"></div><div class="PRIVATE_TreeView-item-visual" aria-hidden="true"><svg aria-hidden="true" focusable="false" class="octicon octicon-file" viewBox="0 0 16 16" width="16" height="16" fill="currentColor" style="display: inline-block; user-select: none; vertical-align: text-bottom; overflow: visible;"><path d="M2 1.75C2 .784 2.784 0 3.75 0h6.586c.464 0 .909.184 1.237.513l2.914 2.914c.329.328.513.773.513 1.237v9.586A1.75 1.75 0 0 1 13.25 16h-9.5A1.75 1.75 0 0 1 2 14.25Zm1.75-.25a.25.25 0 0 0-.25.25v12.5c0 .138.112.25.25.25h9.5a.25.25 0 0 0 .25-.25V6h-2.75A1.75 1.75 0 0 1 9 4.25V1.5Zm6.75.062V4.25c0 .138.112.25.25.25h2.688l-.011-.013-2.914-2.914-.013-.011Z"></path></svg></div><span class="PRIVATE_TreeView-item-content-text"><span>store.html</span></span></div></div></li><li class="PRIVATE_TreeView-item" tabindex="-1" id="weather.html-item" role="treeitem" aria-labelledby=":r4k:" aria-describedby=":r4l:" aria-level="1" aria-selected="false"><div class="PRIVATE_TreeView-item-container" style="--level: 1; content-visibility: auto; contain-intrinsic-size: auto 2rem;"><div style="grid-area: spacer; display: flex;"><div style="width: 100%; display: flex;"></div></div><div id=":r4k:" class="PRIVATE_TreeView-item-content"><div class="PRIVATE_VisuallyHidden" aria-hidden="true" id=":r4l:"></div><div class="PRIVATE_TreeView-item-visual" aria-hidden="true"><svg aria-hidden="true" focusable="false" class="octicon octicon-file" viewBox="0 0 16 16" width="16" height="16" fill="currentColor" style="display: inline-block; user-select: none; vertical-align: text-bottom; overflow: visible;"><path d="M2 1.75C2 .784 2.784 0 3.75 0h6.586c.464 0 .909.184 1.237.513l2.914 2.914c.329.328.513.773.513 1.237v9.586A1.75 1.75 0 0 1 13.25 16h-9.5A1.75 1.75 0 0 1 2 14.25Zm1.75-.25a.25.25 0 0 0-.25.25v12.5c0 .138.112.25.25.25h9.5a.25.25 0 0 0 .25-.25V6h-2.75A1.75 1.75 0 0 1 9 4.25V1.5Zm6.75.062V4.25c0 .138.112.25.25.25h2.688l-.011-.013-2.914-2.914-.013-.011Z"></path></svg></div><span class="PRIVATE_TreeView-item-content-text"><span>weather.html</span></span></div></div></li></ul></nav></div></div></div></div></div></div></div><div class="Box-sc-g0xbh4-0 tLGNc"><div role="slider" aria-label="Draggable pane splitter" aria-valuemin="256" aria-valuemax="399" aria-valuenow="320" aria-valuetext="Pane width 320 pixels" tabindex="0" class="Box-sc-g0xbh4-0 bHLmSv"></div></div></div></div><div class="Box-sc-g0xbh4-0 iKqMNA"><div class="Box-sc-g0xbh4-0"></div><div class="Box-sc-g0xbh4-0 FxAyp"><div data-selector="repos-split-pane-content" tabindex="0" class="Box-sc-g0xbh4-0 leYMvG"><div class="Box-sc-g0xbh4-0 KMPzq"><div class="Box-sc-g0xbh4-0 hfKjHv container"><div class="px-3 pt-3 pb-0" id="StickyHeader"><div class="Box-sc-g0xbh4-0 gZWyZE"><div class="Box-sc-g0xbh4-0 dwYKDk"><div class="Box-sc-g0xbh4-0 iDtIiT"><div class="Box-sc-g0xbh4-0 cEytCf"><nav data-testid="breadcrumbs" aria-labelledby="repos-header-breadcrumb--wide-heading" id="repos-header-breadcrumb--wide" class="Box-sc-g0xbh4-0 fzFXnm"><h2 class="sr-only ScreenReaderHeading-module__userSelectNone--vW4Cq prc-Heading-Heading-6CmGO" data-testid="screen-reader-heading" id="repos-header-breadcrumb--wide-heading">Breadcrumbs</h2><ol class="Box-sc-g0xbh4-0 iMnkmv"><li class="Box-sc-g0xbh4-0 ghzDag"><a class="Box-sc-g0xbh4-0 kHuKdh prc-Link-Link-85e08" sx="[object Object]" data-testid="breadcrumbs-repo-link" href="https://github.com/AmirishettyAkhila/web-technologies2025/tree/main">web-technologies2025</a></li></ol></nav><div data-testid="breadcrumbs-filename" class="Box-sc-g0xbh4-0 ghzDag"><span class="Text__StyledText-sc-17v1xeu-0 HlHVj" aria-hidden="true">/</span><h1 class="Box-sc-g0xbh4-0 jGhzSQ prc-Heading-Heading-6CmGO" tabindex="-1" id="file-name-id-wide">CollegeManagementSystem.java</h1></div><button data-component="IconButton" type="button" class="prc-Button-ButtonBase-c50BI ml-2 prc-Button-IconButton-szpyj" data-loading="false" data-no-visuals="true" data-size="small" data-variant="invisible" aria-describedby=":R3td9lab:-loading-announcement" aria-labelledby=":Rdd9lab:"><svg aria-hidden="true" focusable="false" class="octicon octicon-copy" viewBox="0 0 16 16" width="16" height="16" fill="currentColor" style="display:inline-block;user-select:none;vertical-align:text-bottom;overflow:visible"><path d="M0 6.75C0 5.784.784 5 1.75 5h1.5a.75.75 0 0 1 0 1.5h-1.5a.25.25 0 0 0-.25.25v7.5c0 .138.112.25.25.25h7.5a.25.25 0 0 0 .25-.25v-1.5a.75.75 0 0 1 1.5 0v1.5A1.75 1.75 0 0 1 9.25 16h-7.5A1.75 1.75 0 0 1 0 14.25Z"></path><path d="M5 1.75C5 .784 5.784 0 6.75 0h7.5C15.216 0 16 .784 16 1.75v7.5A1.75 1.75 0 0 1 14.25 11h-7.5A1.75 1.75 0 0 1 5 9.25Zm1.75-.25a.25.25 0 0 0-.25.25v7.5c0 .138.112.25.25.25h7.5a.25.25 0 0 0 .25-.25v-7.5a.25.25 0 0 0-.25-.25Z"></path></svg></button><span class="Tooltip__StyledTooltip-sc-e45c7z-0 jOyaRH CopyToClipboardButton-module__tooltip--Dq1IB" data-direction="nw" aria-label="Copy path" aria-hidden="true" id=":Rdd9lab:" popover="auto">Copy path</span></div></div><div class="react-code-view-header-element--wide"><div class="Box-sc-g0xbh4-0 faNtbn"><div class="d-flex gap-2"> <button hidden="" data-testid="" data-hotkey-scope="read-only-cursor-text-area" data-hotkey="l,Shift+L"></button><button hidden="" data-hotkey="l,Shift+L"></button><button hidden="" data-testid="" data-hotkey-scope="read-only-cursor-text-area" data-hotkey="Mod+Alt+g"></button><button hidden="" data-hotkey="Mod+Alt+g"></button><button type="button" class="Box-sc-g0xbh4-0 dwNhzn prc-Button-ButtonBase-c50BI" data-loading="false" data-no-visuals="true" data-size="medium" data-variant="default" aria-describedby=":R2l6d9lab:-loading-announcement" data-hotkey="b,Shift+B,Control+/ Control+b"><span data-component="buttonContent" class="Box-sc-g0xbh4-0 gUkoLg prc-Button-ButtonContent-HKbr-"><span data-component="text" class="prc-Button-Label-pTQ3x">Blame</span></span></button><button hidden="" data-testid="" data-hotkey-scope="read-only-cursor-text-area" data-hotkey="b,Shift+B,Control+/ Control+b"></button><button data-component="IconButton" type="button" aria-label="More file actions" title="More file actions" data-testid="more-file-actions-button-nav-menu-wide" aria-haspopup="true" aria-expanded="false" tabindex="0" class="Box-sc-g0xbh4-0 fGwBZA prc-Button-ButtonBase-c50BI js-blob-dropdown-click prc-Button-IconButton-szpyj" data-loading="false" data-no-visuals="true" data-size="medium" data-variant="default" aria-describedby=":R156d9lab:-loading-announcement" id=":R156d9lab:"><svg aria-hidden="true" focusable="false" class="octicon octicon-kebab-horizontal" viewBox="0 0 16 16" width="16" height="16" fill="currentColor" style="display:inline-block;user-select:none;vertical-align:text-bottom;overflow:visible"><path d="M8 9a1.5 1.5 0 1 0 0-3 1.5 1.5 0 0 0 0 3ZM1.5 9a1.5 1.5 0 1 0 0-3 1.5 1.5 0 0 0 0 3Zm13 0a1.5 1.5 0 1 0 0-3 1.5 1.5 0 0 0 0 3Z"></path></svg></button> </div></div></div><div class="react-code-view-header-element--narrow"><div class="Box-sc-g0xbh4-0 faNtbn"><div class="d-flex gap-2"> <button hidden="" data-testid="" data-hotkey-scope="read-only-cursor-text-area" data-hotkey="l,Shift+L"></button><button hidden="" data-hotkey="l,Shift+L"></button><button hidden="" data-testid="" data-hotkey-scope="read-only-cursor-text-area" data-hotkey="Mod+Alt+g"></button><button hidden="" data-hotkey="Mod+Alt+g"></button><button type="button" class="Box-sc-g0xbh4-0 dwNhzn prc-Button-ButtonBase-c50BI" data-loading="false" data-no-visuals="true" data-size="medium" data-variant="default" aria-describedby=":R2l7d9lab:-loading-announcement" data-hotkey="b,Shift+B,Control+/ Control+b"><span data-component="buttonContent" class="Box-sc-g0xbh4-0 gUkoLg prc-Button-ButtonContent-HKbr-"><span data-component="text" class="prc-Button-Label-pTQ3x">Blame</span></span></button><button hidden="" data-testid="" data-hotkey-scope="read-only-cursor-text-area" data-hotkey="b,Shift+B,Control+/ Control+b"></button><button data-component="IconButton" type="button" aria-label="More file actions" title="More file actions" data-testid="more-file-actions-button-nav-menu-narrow" aria-haspopup="true" aria-expanded="false" tabindex="0" class="Box-sc-g0xbh4-0 fGwBZA prc-Button-ButtonBase-c50BI js-blob-dropdown-click prc-Button-IconButton-szpyj" data-loading="false" data-no-visuals="true" data-size="medium" data-variant="default" aria-describedby=":R157d9lab:-loading-announcement" id=":R157d9lab:"><svg aria-hidden="true" focusable="false" class="octicon octicon-kebab-horizontal" viewBox="0 0 16 16" width="16" height="16" fill="currentColor" style="display:inline-block;user-select:none;vertical-align:text-bottom;overflow:visible"><path d="M8 9a1.5 1.5 0 1 0 0-3 1.5 1.5 0 0 0 0 3ZM1.5 9a1.5 1.5 0 1 0 0-3 1.5 1.5 0 0 0 0 3Zm13 0a1.5 1.5 0 1 0 0-3 1.5 1.5 0 0 0 0 3Z"></path></svg></button> </div></div></div></div></div></div></div></div><div class="Box-sc-g0xbh4-0 dJxjrT react-code-view-bottom-padding"> <div class="Box-sc-g0xbh4-0 eFxKDQ"></div> <!-- --> <!-- --> </div><div class="Box-sc-g0xbh4-0 dJxjrT"> <!-- --> <!-- --> <button hidden="" data-testid="" data-hotkey-scope="read-only-cursor-text-area" data-hotkey="r,Shift+R"></button><button hidden="" data-hotkey="r,Shift+R"></button><div class="d-flex flex-column border rounded-2 mb-3 pl-1"><div class="Box-sc-g0xbh4-0 dzCJzi"><h2 class="sr-only ScreenReaderHeading-module__userSelectNone--vW4Cq prc-Heading-Heading-6CmGO" data-testid="screen-reader-heading">Latest commit</h2><div data-testid="latest-commit" class="Box-sc-g0xbh4-0 ePWWCk"><div class="Box-sc-g0xbh4-0 dpBUfI"><div data-testid="author-avatar" class="Box-sc-g0xbh4-0 hKWjvQ"><a class="prc-Link-Link-85e08" href="https://github.com/AmirishettyAkhila" data-testid="avatar-icon-link" data-hovercard-url="/users/AmirishettyAkhila/hovercard"><img data-component="Avatar" class="Box-sc-g0xbh4-0 cvdqJW prc-Avatar-Avatar-ZRS-m" alt="AmirishettyAkhila" width="20" height="20" src="./web-technologies2025_CollegeManagementSystem_files/163986912" data-testid="github-avatar" aria-label="AmirishettyAkhila" style="--avatarSize-regular: 20px;"></a><a class="Box-sc-g0xbh4-0 dkaFxu prc-Link-Link-85e08" data-muted="true" href="https://github.com/AmirishettyAkhila/web-technologies2025/commits?author=AmirishettyAkhila" aria-label="commits by AmirishettyAkhila" data-hovercard-url="/users/AmirishettyAkhila/hovercard">AmirishettyAkhila</a></div><span class=""></span></div><div class="Box-sc-g0xbh4-0 erEOeb d-none d-sm-flex"><div class="Truncate flex-items-center f5"><span class="Text__StyledText-sc-17v1xeu-0 hWqAbU Truncate-text" data-testid="latest-commit-html"><a href="https://github.com/AmirishettyAkhila/web-technologies2025/commit/9923b3982adcce1bfe4aedaffcff5f7dd2be4f75" class="Link--secondary" data-pjax="true" data-hovercard-url="/AmirishettyAkhila/web-technologies2025/commit/9923b3982adcce1bfe4aedaffcff5f7dd2be4f75/hovercard">Add files via upload</a></span></div></div><span class="d-flex d-sm-none fgColor-muted f6"><relative-time class="sc-aXZVg" tense="past" datetime="2025-02-24T11:16:59.000Z" title="Feb 24, 2025, 6:16 AM EST"><template shadowrootmode="open">yesterday</template>Feb 24, 2025</relative-time></span></div><div class="d-flex flex-shrink-0 gap-2"><div data-testid="latest-commit-details" class="d-none d-sm-flex flex-items-center"><span class="d-flex flex-nowrap fgColor-muted f6"><a class="Link--secondary prc-Link-Link-85e08" aria-label="Commit 9923b39" data-hovercard-url="/AmirishettyAkhila/web-technologies2025/commit/9923b3982adcce1bfe4aedaffcff5f7dd2be4f75/hovercard" href="https://github.com/AmirishettyAkhila/web-technologies2025/commit/9923b3982adcce1bfe4aedaffcff5f7dd2be4f75">9923b39</a>&nbsp;·&nbsp;<relative-time class="sc-aXZVg" tense="past" datetime="2025-02-24T11:16:59.000Z" title="Feb 24, 2025, 6:16 AM EST"><template shadowrootmode="open">yesterday</template>Feb 24, 2025</relative-time></span></div><div class="d-flex gap-2"><h2 class="sr-only ScreenReaderHeading-module__userSelectNone--vW4Cq prc-Heading-Heading-6CmGO" data-testid="screen-reader-heading">History</h2><a href="https://github.com/AmirishettyAkhila/web-technologies2025/commits/main/CollegeManagementSystem.java" class="prc-Button-ButtonBase-c50BI d-none d-lg-flex LinkButton-module__code-view-link-button--xvCGA flex-items-center fgColor-default" data-loading="false" data-size="small" data-variant="invisible" aria-describedby=":R5dlal9lab:-loading-announcement"><span data-component="buttonContent" data-align="center" class="prc-Button-ButtonContent-HKbr-"><span data-component="leadingVisual" class="prc-Button-Visual-2epfX prc-Button-VisualWrap-Db-eB"><svg aria-hidden="true" focusable="false" class="octicon octicon-history" viewBox="0 0 16 16" width="16" height="16" fill="currentColor" style="display:inline-block;user-select:none;vertical-align:text-bottom;overflow:visible"><path d="m.427 1.927 1.215 1.215a8.002 8.002 0 1 1-1.6 5.685.75.75 0 1 1 1.493-.154 6.5 6.5 0 1 0 1.18-4.458l1.358 1.358A.25.25 0 0 1 3.896 6H.25A.25.25 0 0 1 0 5.75V2.104a.25.25 0 0 1 .427-.177ZM7.75 4a.75.75 0 0 1 .75.75v2.992l2.028.812a.75.75 0 0 1-.557 1.392l-2.5-1A.751.751 0 0 1 7 8.25v-3.5A.75.75 0 0 1 7.75 4Z"></path></svg></span><span data-component="text" class="prc-Button-Label-pTQ3x"><span class="fgColor-default">History</span></span></span></a><div class="d-sm-none"><button data-component="IconButton" type="button" aria-label="Open commit details" aria-pressed="false" aria-expanded="false" data-testid="latest-commit-details-toggle" class="Box-sc-g0xbh4-0 hdOVEE prc-Button-ButtonBase-c50BI prc-Button-IconButton-szpyj" data-loading="false" data-no-visuals="true" data-size="small" data-variant="invisible" aria-describedby=":r4u:-loading-announcement"><svg aria-hidden="true" focusable="false" class="octicon octicon-ellipsis" viewBox="0 0 16 16" width="16" height="16" fill="currentColor" style="display: inline-block; user-select: none; vertical-align: text-bottom; overflow: visible;"><path d="M0 5.75C0 4.784.784 4 1.75 4h12.5c.966 0 1.75.784 1.75 1.75v4.5A1.75 1.75 0 0 1 14.25 12H1.75A1.75 1.75 0 0 1 0 10.25ZM12 7a1 1 0 1 0 0 2 1 1 0 0 0 0-2ZM7 8a1 1 0 1 0 2 0 1 1 0 0 0-2 0ZM4 7a1 1 0 1 0 0 2 1 1 0 0 0 0-2Z"></path></svg></button></div><div class="d-flex d-lg-none"><span role="tooltip" aria-label="History" id="history-icon-button-tooltip" class="Tooltip__TooltipBase-sc-17tf59c-0 hWlpPn tooltipped-n"><a href="https://github.com/AmirishettyAkhila/web-technologies2025/commits/main/CollegeManagementSystem.java" class="prc-Button-ButtonBase-c50BI LinkButton-module__code-view-link-button--xvCGA flex-items-center fgColor-default" data-loading="false" data-size="small" data-variant="invisible" aria-describedby=":Rpdlal9lab:-loading-announcement history-icon-button-tooltip"><span data-component="buttonContent" data-align="center" class="prc-Button-ButtonContent-HKbr-"><span data-component="leadingVisual" class="prc-Button-Visual-2epfX prc-Button-VisualWrap-Db-eB"><svg aria-hidden="true" focusable="false" class="octicon octicon-history" viewBox="0 0 16 16" width="16" height="16" fill="currentColor" style="display:inline-block;user-select:none;vertical-align:text-bottom;overflow:visible"><path d="m.427 1.927 1.215 1.215a8.002 8.002 0 1 1-1.6 5.685.75.75 0 1 1 1.493-.154 6.5 6.5 0 1 0 1.18-4.458l1.358 1.358A.25.25 0 0 1 3.896 6H.25A.25.25 0 0 1 0 5.75V2.104a.25.25 0 0 1 .427-.177ZM7.75 4a.75.75 0 0 1 .75.75v2.992l2.028.812a.75.75 0 0 1-.557 1.392l-2.5-1A.751.751 0 0 1 7 8.25v-3.5A.75.75 0 0 1 7.75 4Z"></path></svg></span></span></a></span></div></div></div></div></div><div class="Box-sc-g0xbh4-0 ldRxiI"><div class="Box-sc-g0xbh4-0 fVkfyA container"><div class="Box-sc-g0xbh4-0 gNAmSV react-code-size-details-banner"><div class="Box-sc-g0xbh4-0 jNEwzY react-code-size-details-banner"><div class="Box-sc-g0xbh4-0 bsDwxw text-mono"><div title="5.1 KB" data-testid="blob-size" class="Truncate__StyledTruncate-sc-23o1d2-0 eAtkQz"><span>123 lines (109 loc) · 5.1 KB</span></div></div></div></div><div class="Box-sc-g0xbh4-0 jdLMhu react-blob-view-header-sticky" id="repos-sticky-header"><div class="Box-sc-g0xbh4-0 tOISc"><div class="react-blob-sticky-header"><div class="Box-sc-g0xbh4-0 hqwSEx"><div class="Box-sc-g0xbh4-0 lzKZY"><div class="Box-sc-g0xbh4-0 fHind"><nav data-testid="breadcrumbs" aria-labelledby="sticky-breadcrumb-heading" id="sticky-breadcrumb" class="Box-sc-g0xbh4-0 fzFXnm"><h2 class="sr-only ScreenReaderHeading-module__userSelectNone--vW4Cq prc-Heading-Heading-6CmGO" data-testid="screen-reader-heading" id="sticky-breadcrumb-heading">Breadcrumbs</h2><ol class="Box-sc-g0xbh4-0 iMnkmv"><li class="Box-sc-g0xbh4-0 ghzDag"><a class="Box-sc-g0xbh4-0 kHuKdh prc-Link-Link-85e08" sx="[object Object]" data-testid="breadcrumbs-repo-link" href="https://github.com/AmirishettyAkhila/web-technologies2025/tree/main">web-technologies2025</a></li></ol></nav><div data-testid="breadcrumbs-filename" class="Box-sc-g0xbh4-0 ghzDag"><span class="Text__StyledText-sc-17v1xeu-0 lauzFl" aria-hidden="true">/</span><h1 class="Box-sc-g0xbh4-0 dnZoUW prc-Heading-Heading-6CmGO" tabindex="-1" id="sticky-file-name-id">CollegeManagementSystem.java</h1></div></div><button style="--button-color:fg.default" type="button" class="Box-sc-g0xbh4-0 jRZWlf prc-Button-ButtonBase-c50BI" data-loading="false" data-size="small" data-variant="invisible" aria-describedby=":Riptal9lab:-loading-announcement"><span data-component="buttonContent" class="Box-sc-g0xbh4-0 gUkoLg prc-Button-ButtonContent-HKbr-"><span data-component="leadingVisual" class="prc-Button-Visual-2epfX prc-Button-VisualWrap-Db-eB"><svg aria-hidden="true" focusable="false" class="octicon octicon-arrow-up" viewBox="0 0 16 16" width="16" height="16" fill="currentColor" style="display:inline-block;user-select:none;vertical-align:text-bottom;overflow:visible"><path d="M3.47 7.78a.75.75 0 0 1 0-1.06l4.25-4.25a.75.75 0 0 1 1.06 0l4.25 4.25a.751.751 0 0 1-.018 1.042.751.751 0 0 1-1.042.018L9 4.81v7.44a.75.75 0 0 1-1.5 0V4.81L4.53 7.78a.75.75 0 0 1-1.06 0Z"></path></svg></span><span data-component="text" class="prc-Button-Label-pTQ3x">Top</span></span></button></div></div></div><div class="Box-sc-g0xbh4-0 kTvpNk"><h2 class="sr-only ScreenReaderHeading-module__userSelectNone--vW4Cq prc-Heading-Heading-6CmGO" data-testid="screen-reader-heading">File metadata and controls</h2><div class="Box-sc-g0xbh4-0 iNMjfP"><ul aria-label="File view" class="SegmentedControl__SegmentedControlList-sc-1rzig82-0 lawgDG" data-size="small"><li class="Box-sc-g0xbh4-0 fefCSX" data-selected="true"><button aria-current="true" class="SegmentedControlButton__SegmentedControlButtonStyled-sc-8lkgxl-0 dbGjOi" type="button" data-hotkey="Control+/ Control+c"><span class="segmentedControl-content"><div class="Box-sc-g0xbh4-0 segmentedControl-text" data-text="Code">Code</div></span></button></li><li class="Box-sc-g0xbh4-0 idgUkN"><button aria-current="false" class="SegmentedControlButton__SegmentedControlButtonStyled-sc-8lkgxl-0 bHmvop" type="button" data-hotkey="b,Shift+B,Control+/ Control+b"><span class="segmentedControl-content"><div class="Box-sc-g0xbh4-0 segmentedControl-text" data-text="Blame">Blame</div></span></button></li></ul><button hidden="" data-testid="" data-hotkey-scope="read-only-cursor-text-area" data-hotkey="Control+/ Control+c"></button><button hidden="" data-testid="" data-hotkey-scope="read-only-cursor-text-area" data-hotkey="b,Shift+B,Control+/ Control+b"></button><div class="Box-sc-g0xbh4-0 jNEwzY react-code-size-details-in-header"><div class="Box-sc-g0xbh4-0 bsDwxw text-mono"><div title="5.1 KB" data-testid="blob-size" class="Truncate__StyledTruncate-sc-23o1d2-0 eAtkQz"><span>123 lines (109 loc) · 5.1 KB</span></div></div></div></div><div class="Box-sc-g0xbh4-0 kcLCKF"><button hidden="" data-testid="" data-hotkey="Control+Shift+&gt;" data-hotkey-scope="read-only-cursor-text-area"></button><button hidden="" data-hotkey="Control+Shift+&gt;"></button><button hidden="" data-testid="" data-hotkey="Control+Shift+&lt;" data-hotkey-scope="read-only-cursor-text-area"></button><button hidden="" data-hotkey="Control+Shift+&lt;"></button><div class="Box-sc-g0xbh4-0 pr-0 prc-ButtonGroup-ButtonGroup-vcMeG"><div><button data-component="IconButton" type="button" data-testid="copilot-ask-menu" class="prc-Button-ButtonBase-c50BI AskCopilotButton-module__square--o8kDO prc-Button-IconButton-szpyj" data-loading="false" data-no-visuals="true" data-size="small" data-variant="default" aria-describedby="blob-view-header-copilot-icon-loading-announcement" aria-labelledby=":Rbsptal9lab:" id="blob-view-header-copilot-icon"><svg aria-hidden="true" focusable="false" class="octicon octicon-copilot" viewBox="0 0 16 16" width="16" height="16" fill="currentColor" style="display:inline-block;user-select:none;vertical-align:text-bottom;overflow:visible"><path d="M7.998 15.035c-4.562 0-7.873-2.914-7.998-3.749V9.338c.085-.628.677-1.686 1.588-2.065.013-.07.024-.143.036-.218.029-.183.06-.384.126-.612-.201-.508-.254-1.084-.254-1.656 0-.87.128-1.769.693-2.484.579-.733 1.494-1.124 2.724-1.261 1.206-.134 2.262.034 2.944.765.05.053.096.108.139.165.044-.057.094-.112.143-.165.682-.731 1.738-.899 2.944-.765 1.23.137 2.145.528 2.724 1.261.566.715.693 1.614.693 2.484 0 .572-.053 1.148-.254 1.656.066.228.098.429.126.612.012.076.024.148.037.218.924.385 1.522 1.471 1.591 2.095v1.872c0 .766-3.351 3.795-8.002 3.795Zm0-1.485c2.28 0 4.584-1.11 5.002-1.433V7.862l-.023-.116c-.49.21-1.075.291-1.727.291-1.146 0-2.059-.327-2.71-.991A3.222 3.222 0 0 1 8 6.303a3.24 3.24 0 0 1-.544.743c-.65.664-1.563.991-2.71.991-.652 0-1.236-.081-1.727-.291l-.023.116v4.255c.419.323 2.722 1.433 5.002 1.433ZM6.762 2.83c-.193-.206-.637-.413-1.682-.297-1.019.113-1.479.404-1.713.7-.247.312-.369.789-.369 1.554 0 .793.129 1.171.308 1.371.162.181.519.379 1.442.379.853 0 1.339-.235 1.638-.54.315-.322.527-.827.617-1.553.117-.935-.037-1.395-.241-1.614Zm4.155-.297c-1.044-.116-1.488.091-1.681.297-.204.219-.359.679-.242 1.614.091.726.303 1.231.618 1.553.299.305.784.54 1.638.54.922 0 1.28-.198 1.442-.379.179-.2.308-.578.308-1.371 0-.765-.123-1.242-.37-1.554-.233-.296-.693-.587-1.713-.7Z"></path><path d="M6.25 9.037a.75.75 0 0 1 .75.75v1.501a.75.75 0 0 1-1.5 0V9.787a.75.75 0 0 1 .75-.75Zm4.25.75v1.501a.75.75 0 0 1-1.5 0V9.787a.75.75 0 0 1 1.5 0Z"></path></svg></button><span class="Tooltip__StyledTooltip-sc-e45c7z-0 jOyaRH" data-direction="s" aria-hidden="true" id=":Rbsptal9lab:" popover="auto">Ask Copilot about this file</span></div><div></div></div><div class="Box-sc-g0xbh4-0 kVWtTz react-blob-header-edit-and-raw-actions"><div class="Box-sc-g0xbh4-0 prc-ButtonGroup-ButtonGroup-vcMeG"><div><a href="https://github.com/AmirishettyAkhila/web-technologies2025/raw/refs/heads/main/CollegeManagementSystem.java" data-testid="raw-button" class="Box-sc-g0xbh4-0 gWqxTd prc-Button-ButtonBase-c50BI" data-loading="false" data-no-visuals="true" data-size="small" data-variant="default" aria-describedby=":R5csptal9lab:-loading-announcement" data-hotkey="Control+/ Control+r"><span data-component="buttonContent" class="Box-sc-g0xbh4-0 gUkoLg prc-Button-ButtonContent-HKbr-"><span data-component="text" class="prc-Button-Label-pTQ3x">Raw</span></span></a></div><div><button data-component="IconButton" type="button" aria-label="Copy raw content" data-testid="copy-raw-button" class="prc-Button-ButtonBase-c50BI prc-Button-IconButton-szpyj" data-loading="false" data-no-visuals="true" data-size="small" data-variant="default" aria-describedby=":Rpcsptal9lab:-loading-announcement" data-hotkey="Control+Shift+C"><svg aria-hidden="true" focusable="false" class="octicon octicon-copy" viewBox="0 0 16 16" width="16" height="16" fill="currentColor" style="display:inline-block;user-select:none;vertical-align:text-bottom;overflow:visible"><path d="M0 6.75C0 5.784.784 5 1.75 5h1.5a.75.75 0 0 1 0 1.5h-1.5a.25.25 0 0 0-.25.25v7.5c0 .138.112.25.25.25h7.5a.25.25 0 0 0 .25-.25v-1.5a.75.75 0 0 1 1.5 0v1.5A1.75 1.75 0 0 1 9.25 16h-7.5A1.75 1.75 0 0 1 0 14.25Z"></path><path d="M5 1.75C5 .784 5.784 0 6.75 0h7.5C15.216 0 16 .784 16 1.75v7.5A1.75 1.75 0 0 1 14.25 11h-7.5A1.75 1.75 0 0 1 5 9.25Zm1.75-.25a.25.25 0 0 0-.25.25v7.5c0 .138.112.25.25.25h7.5a.25.25 0 0 0 .25-.25v-7.5a.25.25 0 0 0-.25-.25Z"></path></svg></button></div><div><span role="tooltip" aria-label="Download raw file" id=":Rdcsptal9lab:" class="Tooltip__TooltipBase-sc-17tf59c-0 hWlpPn tooltipped-n"><button data-component="IconButton" type="button" aria-label="Download raw content" data-testid="download-raw-button" class="Box-sc-g0xbh4-0 ivobqY prc-Button-ButtonBase-c50BI prc-Button-IconButton-szpyj" data-loading="false" data-no-visuals="true" data-size="small" data-variant="default" aria-describedby=":Rtcsptal9lab:-loading-announcement" data-hotkey="Control+Shift+S"><svg aria-hidden="true" focusable="false" class="octicon octicon-download" viewBox="0 0 16 16" width="16" height="16" fill="currentColor" style="display:inline-block;user-select:none;vertical-align:text-bottom;overflow:visible"><path d="M2.75 14A1.75 1.75 0 0 1 1 12.25v-2.5a.75.75 0 0 1 1.5 0v2.5c0 .138.112.25.25.25h10.5a.25.25 0 0 0 .25-.25v-2.5a.75.75 0 0 1 1.5 0v2.5A1.75 1.75 0 0 1 13.25 14Z"></path><path d="M7.25 7.689V2a.75.75 0 0 1 1.5 0v5.689l1.97-1.969a.749.749 0 1 1 1.06 1.06l-3.25 3.25a.749.749 0 0 1-1.06 0L4.22 6.78a.749.749 0 1 1 1.06-1.06l1.97 1.969Z"></path></svg></button></span></div></div><button hidden="" data-testid="raw-button-shortcut" data-hotkey-scope="read-only-cursor-text-area" data-hotkey="Control+/ Control+r"></button><button hidden="" data-testid="copy-raw-button-shortcut" data-hotkey-scope="read-only-cursor-text-area" data-hotkey="Control+Shift+C"></button><button hidden="" data-testid="download-raw-button-shortcut" data-hotkey-scope="read-only-cursor-text-area" data-hotkey="Control+Shift+S"></button><a class="js-github-dev-shortcut d-none prc-Link-Link-85e08" href="https://github.dev/" data-hotkey="., Control+Shift+/"></a><button hidden="" data-testid="" data-hotkey-scope="read-only-cursor-text-area" data-hotkey="., Control+Shift+/"></button><a class="js-github-dev-new-tab-shortcut d-none prc-Link-Link-85e08" href="https://github.dev/" target="_blank" data-hotkey="Shift+.,Shift+&gt;,&gt;"></a><button hidden="" data-testid="" data-hotkey-scope="read-only-cursor-text-area" data-hotkey="Shift+.,Shift+&gt;,&gt;"></button><div class="Box-sc-g0xbh4-0 prc-ButtonGroup-ButtonGroup-vcMeG"><div><span role="tooltip" aria-label="Fork this repository and edit the file" id=":R6ksptal9lab:" class="Tooltip__TooltipBase-sc-17tf59c-0 hWlpPn tooltipped-nw"><a sx="[object Object]" data-component="IconButton" type="button" aria-label="Edit file" data-testid="edit-button" class="Box-sc-g0xbh4-0 kilKoS prc-Button-ButtonBase-c50BI prc-Button-IconButton-szpyj" data-loading="false" data-no-visuals="true" data-size="small" data-variant="default" aria-describedby=":Rmksptal9lab:-loading-announcement" href="https://github.com/AmirishettyAkhila/web-technologies2025/edit/main/CollegeManagementSystem.java" data-hotkey="e,Shift+E"><svg aria-hidden="true" focusable="false" class="octicon octicon-pencil" viewBox="0 0 16 16" width="16" height="16" fill="currentColor" style="display:inline-block;user-select:none;vertical-align:text-bottom;overflow:visible"><path d="M11.013 1.427a1.75 1.75 0 0 1 2.474 0l1.086 1.086a1.75 1.75 0 0 1 0 2.474l-8.61 8.61c-.21.21-.47.364-.756.445l-3.251.93a.75.75 0 0 1-.927-.928l.929-3.25c.081-.286.235-.547.445-.758l8.61-8.61Zm.176 4.823L9.75 4.81l-6.286 6.287a.253.253 0 0 0-.064.108l-.558 1.953 1.953-.558a.253.253 0 0 0 .108-.064Zm1.238-3.763a.25.25 0 0 0-.354 0L10.811 3.75l1.439 1.44 1.263-1.263a.25.25 0 0 0 0-.354Z"></path></svg></a></span></div><div><button data-component="IconButton" type="button" aria-label="More edit options" data-testid="more-edit-button" aria-haspopup="true" aria-expanded="false" tabindex="0" class="prc-Button-ButtonBase-c50BI prc-Button-IconButton-szpyj" data-loading="false" data-no-visuals="true" data-size="small" data-variant="default" aria-describedby=":Raksptal9lab:-loading-announcement" id=":Raksptal9lab:"><svg aria-hidden="true" focusable="false" class="octicon octicon-triangle-down" viewBox="0 0 16 16" width="16" height="16" fill="currentColor" style="display:inline-block;user-select:none;vertical-align:text-bottom;overflow:visible"><path d="m4.427 7.427 3.396 3.396a.25.25 0 0 0 .354 0l3.396-3.396A.25.25 0 0 0 11.396 7H4.604a.25.25 0 0 0-.177.427Z"></path></svg></button></div></div><button hidden="" data-testid="" data-hotkey="e,Shift+E" data-hotkey-scope="read-only-cursor-text-area"></button></div><span role="tooltip" aria-label="Open symbols panel" id=":R5sptal9lab:" class="Tooltip__TooltipBase-sc-17tf59c-0 hWlpPn tooltipped-nw"><button data-component="IconButton" type="button" aria-label="Symbols" aria-pressed="false" aria-expanded="false" aria-controls="symbols-pane" data-testid="symbols-button" class="Box-sc-g0xbh4-0 heuRGy prc-Button-ButtonBase-c50BI prc-Button-IconButton-szpyj" data-loading="false" data-no-visuals="true" data-size="small" data-variant="invisible" aria-describedby="symbols-button-loading-announcement" id="symbols-button" data-hotkey="Control+i"><svg aria-hidden="true" focusable="false" class="octicon octicon-code-square" viewBox="0 0 16 16" width="16" height="16" fill="currentColor" style="display:inline-block;user-select:none;vertical-align:text-bottom;overflow:visible"><path d="M0 1.75C0 .784.784 0 1.75 0h12.5C15.216 0 16 .784 16 1.75v12.5A1.75 1.75 0 0 1 14.25 16H1.75A1.75 1.75 0 0 1 0 14.25Zm1.75-.25a.25.25 0 0 0-.25.25v12.5c0 .138.112.25.25.25h12.5a.25.25 0 0 0 .25-.25V1.75a.25.25 0 0 0-.25-.25Zm7.47 3.97a.75.75 0 0 1 1.06 0l2 2a.75.75 0 0 1 0 1.06l-2 2a.749.749 0 0 1-1.275-.326.749.749 0 0 1 .215-.734L10.69 8 9.22 6.53a.75.75 0 0 1 0-1.06ZM6.78 6.53 5.31 8l1.47 1.47a.749.749 0 0 1-.326 1.275.749.749 0 0 1-.734-.215l-2-2a.75.75 0 0 1 0-1.06l2-2a.751.751 0 0 1 1.042.018.751.751 0 0 1 .018 1.042Z"></path></svg></button></span><div class="react-blob-header-edit-and-raw-actions-combined"><button data-component="IconButton" type="button" aria-label="Edit and raw actions" title="More file actions" data-testid="more-file-actions-button" aria-haspopup="true" aria-expanded="false" tabindex="0" class="Box-sc-g0xbh4-0 ffkqe prc-Button-ButtonBase-c50BI js-blob-dropdown-click prc-Button-IconButton-szpyj" data-loading="false" data-no-visuals="true" data-size="small" data-variant="invisible" aria-describedby=":Rnsptal9lab:-loading-announcement" id=":Rnsptal9lab:"><svg aria-hidden="true" focusable="false" class="octicon octicon-kebab-horizontal" viewBox="0 0 16 16" width="16" height="16" fill="currentColor" style="display:inline-block;user-select:none;vertical-align:text-bottom;overflow:visible"><path d="M8 9a1.5 1.5 0 1 0 0-3 1.5 1.5 0 0 0 0 3ZM1.5 9a1.5 1.5 0 1 0 0-3 1.5 1.5 0 0 0 0 3Zm13 0a1.5 1.5 0 1 0 0-3 1.5 1.5 0 0 0 0 3Z"></path></svg></button></div></div></div></div><div></div></div><div class="Box-sc-g0xbh4-0 hGyMdv"><section aria-labelledby="file-name-id-wide file-name-id-mobile" class="Box-sc-g0xbh4-0 dceWRL"><div class="Box-sc-g0xbh4-0 dGXHv"><div id="highlighted-line-menu-positioner" class="position-relative"><div id="copilot-button-positioner" class="Box-sc-g0xbh4-0 jNYGBv"><div class="Box-sc-g0xbh4-0 iJOeCH"><div class="Box-sc-g0xbh4-0 eJSJhL"><div class="Box-sc-g0xbh4-0 HmmEG"><div aria-hidden="true" data-testid="navigation-cursor" class="Box-sc-g0xbh4-0 code-navigation-cursor" style="top: 0px; left: 92px;"> </div><button hidden="" data-testid="NavigationCursorEnter" data-hotkey="Control+Enter" data-hotkey-scope="read-only-cursor-text-area"></button><button hidden="" data-testid="NavigationCursorSetHighlightedLine" data-hotkey="Shift+J" data-hotkey-scope="read-only-cursor-text-area"></button><button hidden="" data-testid="NavigationCursorSetHighlightAndExpandMenu" data-hotkey="Alt+Shift+C,Alt+Shift+Ç" data-hotkey-scope="read-only-cursor-text-area"></button><button hidden="" data-testid="NavigationCursorPageDown" data-hotkey="PageDown" data-hotkey-scope="read-only-cursor-text-area"></button><button hidden="" data-testid="NavigationCursorPageUp" data-hotkey="PageUp" data-hotkey-scope="read-only-cursor-text-area"></button><button hidden="" data-testid="" data-hotkey="/" data-hotkey-scope="read-only-cursor-text-area"></button></div></div><textarea id="read-only-cursor-text-area" data-testid="read-only-cursor-text-area" aria-label="file content" aria-readonly="true" inputmode="none" tabindex="0" aria-multiline="true" aria-haspopup="false" data-gramm="false" data-gramm_editor="false" data-enable-grammarly="false" spellcheck="false" autocorrect="off" autocapitalize="off" autocomplete="off" data-ms-editor="false" class="react-blob-textarea react-blob-print-hide" style="resize: none; margin-top: -2px; padding-left: 92px; padding-right: 70px; width: 100%; background-color: unset; box-sizing: border-box; color: transparent; position: absolute; border: none; tab-size: 8; outline: none; overflow: auto hidden; height: 2480px; font-size: 12px; line-height: 20px; overflow-wrap: normal; overscroll-behavior-x: none; white-space: pre; z-index: 1;">import java.sql.*;
import java.util.Scanner;

public class CollegeManagementSystem {
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/";
    private static final String DATABASE_NAME = "collegeDB";
    private static final String USER = "root";
    private static final String PASSWORD = "admin";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DATABASE_URL + "mysql", USER, PASSWORD);
             Scanner scanner = new Scanner(System.in)) {
            
            createDatabase(conn);
            try (Connection dbConn = DriverManager.getConnection(DATABASE_URL + DATABASE_NAME, USER, PASSWORD)) {
                createTable(dbConn);
                
                while (true) {
                    System.out.println("Choose an operation: \n1. Insert\n2. Update\n3. Delete\n4. Display\n5. Exit");
                    int choice = scanner.nextInt();
                    scanner.nextLine();

                    switch (choice) {
                        case 1:
                            insertCourse(dbConn, scanner);
                            break;
                        case 2:
                            updateCourse(dbConn, scanner);
                            break;
                        case 3:
                            deleteCourse(dbConn, scanner);
                            break;
                        case 4:
                            displayCourses(dbConn);
                            break;
                        case 5:
                            System.out.println("Exiting program.");
                            return;
                        default:
                            System.out.println("Invalid choice. Try again.");
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createDatabase(Connection conn) throws SQLException {
        String sql = "CREATE DATABASE IF NOT EXISTS " + DATABASE_NAME;
        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(sql);
            System.out.println("Database '" + DATABASE_NAME + "' created successfully or already exists.");
        }
    }

    private static void createTable(Connection conn) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS Courses (" +
                     "CourseID INT AUTO_INCREMENT PRIMARY KEY, " +
                     "Name VARCHAR(255) NOT NULL, " +
                     "Credits INT NOT NULL)";
        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(sql);
            System.out.println("Table 'Courses' created successfully.");
        }
    }

    private static void insertCourse(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter Course Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Credits: ");
        int credits = scanner.nextInt();
        scanner.nextLine();

        String sql = "INSERT INTO Courses (Name, Credits) VALUES (?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, credits);
            pstmt.executeUpdate();
            System.out.println("Record inserted successfully.");
        }
    }

    private static void updateCourse(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter CourseID to update: ");
        int id = scanner.nextInt();
        System.out.print("Enter new Credits value: ");
        int credits = scanner.nextInt();
        scanner.nextLine();

        String sql = "UPDATE Courses SET Credits = ? WHERE CourseID = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, credits);
            pstmt.setInt(2, id);
            int rowsUpdated = pstmt.executeUpdate();
            System.out.println(rowsUpdated &gt; 0 ? "Record updated successfully." : "CourseID not found.");
        }
    }

    private static void deleteCourse(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter CourseID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        String sql = "DELETE FROM Courses WHERE CourseID = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int rowsDeleted = pstmt.executeUpdate();
            System.out.println(rowsDeleted &gt; 0 ? "Record deleted successfully." : "CourseID not found.");
        }
    }

    private static void displayCourses(Connection conn) throws SQLException {
        String sql = "SELECT * FROM Courses";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            System.out.println("Courses Table Records:");
            System.out.println("-----------------------------------------");
            while (rs.next()) {
                System.out.println("CourseID: " + rs.getInt("CourseID") + " | Name: " + rs.getString("Name") + " | Credits: " + rs.getInt("Credits"));
            }
        }
    }
}</textarea><button hidden="" data-testid="" data-hotkey="Alt+F1,Control+Alt+˙,Control+Alt+h" data-hotkey-scope="read-only-cursor-text-area"></button><div class="Box-sc-g0xbh4-0 kHHiZS"><div tabindex="0" class="Box-sc-g0xbh4-0 jqUoVd"><div class="Box-sc-g0xbh4-0 jcHtqt react-code-file-contents" role="presentation" aria-hidden="true" data-tab-size="8" data-paste-markdown-skip="true" data-hpc="true"><div class="react-line-numbers-no-virtualization" style="pointer-events: auto; position: relative; z-index: 2;"><div class="react-no-virtualization-wrapper-lines"><div data-line-number="1" class="react-line-number react-code-text" style="padding-right: 16px;">1</div><div data-line-number="2" class="react-line-number react-code-text" style="padding-right: 16px;">2</div><div data-line-number="3" class="react-line-number react-code-text" style="padding-right: 16px;">3</div><div data-line-number="4" class="react-line-number react-code-text" style="padding-right: 16px;">4<span class="Box-sc-g0xbh4-0 cJGaMs"><div aria-label="Collapse code section" role="button" class="Box-sc-g0xbh4-0 iGLarr"><svg aria-hidden="true" focusable="false" class="Octicon-sc-9kayk9-0" viewBox="0 0 16 16" width="16" height="16" fill="currentColor" style="display: inline-block; user-select: none; vertical-align: text-bottom; overflow: visible;"><path d="M12.78 5.22a.749.749 0 0 1 0 1.06l-4.25 4.25a.749.749 0 0 1-1.06 0L3.22 6.28a.749.749 0 1 1 1.06-1.06L8 8.939l3.72-3.719a.749.749 0 0 1 1.06 0Z"></path></svg></div></span></div><div data-line-number="5" class="child-of-line-3  react-line-number react-code-text" style="padding-right: 16px;">5</div><div data-line-number="6" class="child-of-line-3  react-line-number react-code-text" style="padding-right: 16px;">6</div><div data-line-number="7" class="child-of-line-3  react-line-number react-code-text" style="padding-right: 16px;">7</div><div data-line-number="8" class="child-of-line-3  react-line-number react-code-text" style="padding-right: 16px;">8</div><div data-line-number="9" class="child-of-line-3  react-line-number react-code-text" style="padding-right: 16px;">9</div><div data-line-number="10" class="child-of-line-3  react-line-number react-code-text" style="padding-right: 16px;">10<span class="Box-sc-g0xbh4-0 cJGaMs"><div aria-label="Collapse code section" role="button" class="Box-sc-g0xbh4-0 iGLarr"><svg aria-hidden="true" focusable="false" class="Octicon-sc-9kayk9-0" viewBox="0 0 16 16" width="16" height="16" fill="currentColor" style="display: inline-block; user-select: none; vertical-align: text-bottom; overflow: visible;"><path d="M12.78 5.22a.749.749 0 0 1 0 1.06l-4.25 4.25a.749.749 0 0 1-1.06 0L3.22 6.28a.749.749 0 1 1 1.06-1.06L8 8.939l3.72-3.719a.749.749 0 0 1 1.06 0Z"></path></svg></div></span></div><div data-line-number="11" class="child-of-line-3 child-of-line-9  react-line-number react-code-text" style="padding-right: 16px;">11</div><div data-line-number="12" class="child-of-line-3 child-of-line-9  react-line-number react-code-text" style="padding-right: 16px;">12</div><div data-line-number="13" class="child-of-line-3 child-of-line-9  react-line-number react-code-text" style="padding-right: 16px;">13</div><div data-line-number="14" class="child-of-line-3 child-of-line-9  react-line-number react-code-text" style="padding-right: 16px;">14</div><div data-line-number="15" class="child-of-line-3 child-of-line-9  react-line-number react-code-text" style="padding-right: 16px;">15</div><div data-line-number="16" class="child-of-line-3 child-of-line-9  react-line-number react-code-text" style="padding-right: 16px;">16</div><div data-line-number="17" class="child-of-line-3 child-of-line-9  react-line-number react-code-text" style="padding-right: 16px;">17</div><div data-line-number="18" class="child-of-line-3 child-of-line-9  react-line-number react-code-text" style="padding-right: 16px;">18</div><div data-line-number="19" class="child-of-line-3 child-of-line-9  react-line-number react-code-text" style="padding-right: 16px;">19</div><div data-line-number="20" class="child-of-line-3 child-of-line-9  react-line-number react-code-text" style="padding-right: 16px;">20</div><div data-line-number="21" class="child-of-line-3 child-of-line-9  react-line-number react-code-text" style="padding-right: 16px;">21</div><div data-line-number="22" class="child-of-line-3 child-of-line-9  react-line-number react-code-text" style="padding-right: 16px;">22</div><div data-line-number="23" class="child-of-line-3 child-of-line-9  react-line-number react-code-text" style="padding-right: 16px;">23</div><div data-line-number="24" class="child-of-line-3 child-of-line-9  react-line-number react-code-text" style="padding-right: 16px;">24</div><div data-line-number="25" class="child-of-line-3 child-of-line-9  react-line-number react-code-text" style="padding-right: 16px;">25</div><div data-line-number="26" class="child-of-line-3 child-of-line-9  react-line-number react-code-text" style="padding-right: 16px;">26</div><div data-line-number="27" class="child-of-line-3 child-of-line-9  react-line-number react-code-text" style="padding-right: 16px;">27</div><div data-line-number="28" class="child-of-line-3 child-of-line-9  react-line-number react-code-text" style="padding-right: 16px;">28</div><div data-line-number="29" class="child-of-line-3 child-of-line-9  react-line-number react-code-text" style="padding-right: 16px;">29</div><div data-line-number="30" class="child-of-line-3 child-of-line-9  react-line-number react-code-text" style="padding-right: 16px;">30</div><div data-line-number="31" class="child-of-line-3 child-of-line-9  react-line-number react-code-text" style="padding-right: 16px;">31</div><div data-line-number="32" class="child-of-line-3 child-of-line-9  react-line-number react-code-text" style="padding-right: 16px;">32</div><div data-line-number="33" class="child-of-line-3 child-of-line-9  react-line-number react-code-text" style="padding-right: 16px;">33</div><div data-line-number="34" class="child-of-line-3 child-of-line-9  react-line-number react-code-text" style="padding-right: 16px;">34</div><div data-line-number="35" class="child-of-line-3 child-of-line-9  react-line-number react-code-text" style="padding-right: 16px;">35</div><div data-line-number="36" class="child-of-line-3 child-of-line-9  react-line-number react-code-text" style="padding-right: 16px;">36</div><div data-line-number="37" class="child-of-line-3 child-of-line-9  react-line-number react-code-text" style="padding-right: 16px;">37</div><div data-line-number="38" class="child-of-line-3 child-of-line-9  react-line-number react-code-text" style="padding-right: 16px;">38</div><div data-line-number="39" class="child-of-line-3 child-of-line-9  react-line-number react-code-text" style="padding-right: 16px;">39</div><div data-line-number="40" class="child-of-line-3 child-of-line-9  react-line-number react-code-text" style="padding-right: 16px;">40</div><div data-line-number="41" class="child-of-line-3 child-of-line-9  react-line-number react-code-text" style="padding-right: 16px;">41</div><div data-line-number="42" class="child-of-line-3 child-of-line-9  react-line-number react-code-text" style="padding-right: 16px;">42</div><div data-line-number="43" class="child-of-line-3 child-of-line-9  react-line-number react-code-text" style="padding-right: 16px;">43</div><div data-line-number="44" class="child-of-line-3 child-of-line-9  react-line-number react-code-text" style="padding-right: 16px;">44</div><div data-line-number="45" class="child-of-line-3 child-of-line-9  react-line-number react-code-text" style="padding-right: 16px;">45</div><div data-line-number="46" class="child-of-line-3 child-of-line-9  react-line-number react-code-text" style="padding-right: 16px;">46</div><div data-line-number="47" class="child-of-line-3  react-line-number react-code-text" style="padding-right: 16px;">47</div><div data-line-number="48" class="child-of-line-3  react-line-number react-code-text" style="padding-right: 16px;">48</div><div data-line-number="49" class="child-of-line-3  react-line-number react-code-text" style="padding-right: 16px;">49<span class="Box-sc-g0xbh4-0 cJGaMs"><div aria-label="Collapse code section" role="button" class="Box-sc-g0xbh4-0 iGLarr"><svg aria-hidden="true" focusable="false" class="Octicon-sc-9kayk9-0" viewBox="0 0 16 16" width="16" height="16" fill="currentColor" style="display: inline-block; user-select: none; vertical-align: text-bottom; overflow: visible;"><path d="M12.78 5.22a.749.749 0 0 1 0 1.06l-4.25 4.25a.749.749 0 0 1-1.06 0L3.22 6.28a.749.749 0 1 1 1.06-1.06L8 8.939l3.72-3.719a.749.749 0 0 1 1.06 0Z"></path></svg></div></span></div><div data-line-number="50" class="child-of-line-3 child-of-line-48  react-line-number react-code-text" style="padding-right: 16px;">50</div><div data-line-number="51" class="child-of-line-3 child-of-line-48  react-line-number react-code-text" style="padding-right: 16px;">51</div><div data-line-number="52" class="child-of-line-3 child-of-line-48  react-line-number react-code-text" style="padding-right: 16px;">52</div><div data-line-number="53" class="child-of-line-3 child-of-line-48  react-line-number react-code-text" style="padding-right: 16px;">53</div><div data-line-number="54" class="child-of-line-3 child-of-line-48  react-line-number react-code-text" style="padding-right: 16px;">54</div><div data-line-number="55" class="child-of-line-3  react-line-number react-code-text" style="padding-right: 16px;">55</div><div data-line-number="56" class="child-of-line-3  react-line-number react-code-text" style="padding-right: 16px;">56</div><div data-line-number="57" class="child-of-line-3  react-line-number react-code-text" style="padding-right: 16px;">57<span class="Box-sc-g0xbh4-0 cJGaMs"><div aria-label="Collapse code section" role="button" class="Box-sc-g0xbh4-0 iGLarr"><svg aria-hidden="true" focusable="false" class="Octicon-sc-9kayk9-0" viewBox="0 0 16 16" width="16" height="16" fill="currentColor" style="display: inline-block; user-select: none; vertical-align: text-bottom; overflow: visible;"><path d="M12.78 5.22a.749.749 0 0 1 0 1.06l-4.25 4.25a.749.749 0 0 1-1.06 0L3.22 6.28a.749.749 0 1 1 1.06-1.06L8 8.939l3.72-3.719a.749.749 0 0 1 1.06 0Z"></path></svg></div></span></div><div data-line-number="58" class="child-of-line-3 child-of-line-56  react-line-number react-code-text" style="padding-right: 16px;">58</div><div data-line-number="59" class="child-of-line-3 child-of-line-56  react-line-number react-code-text" style="padding-right: 16px;">59</div><div data-line-number="60" class="child-of-line-3 child-of-line-56  react-line-number react-code-text" style="padding-right: 16px;">60</div></div><div class="react-no-virtualization-wrapper-lines"><div data-line-number="61" class="child-of-line-3 child-of-line-56  react-line-number react-code-text" style="padding-right: 16px;">61</div><div data-line-number="62" class="child-of-line-3 child-of-line-56  react-line-number react-code-text" style="padding-right: 16px;">62</div><div data-line-number="63" class="child-of-line-3 child-of-line-56  react-line-number react-code-text" style="padding-right: 16px;">63</div><div data-line-number="64" class="child-of-line-3 child-of-line-56  react-line-number react-code-text" style="padding-right: 16px;">64</div><div data-line-number="65" class="child-of-line-3 child-of-line-56  react-line-number react-code-text" style="padding-right: 16px;">65</div><div data-line-number="66" class="child-of-line-3  react-line-number react-code-text" style="padding-right: 16px;">66</div><div data-line-number="67" class="child-of-line-3  react-line-number react-code-text" style="padding-right: 16px;">67</div><div data-line-number="68" class="child-of-line-3  react-line-number react-code-text" style="padding-right: 16px;">68<span class="Box-sc-g0xbh4-0 cJGaMs"><div aria-label="Collapse code section" role="button" class="Box-sc-g0xbh4-0 iGLarr"><svg aria-hidden="true" focusable="false" class="Octicon-sc-9kayk9-0" viewBox="0 0 16 16" width="16" height="16" fill="currentColor" style="display: inline-block; user-select: none; vertical-align: text-bottom; overflow: visible;"><path d="M12.78 5.22a.749.749 0 0 1 0 1.06l-4.25 4.25a.749.749 0 0 1-1.06 0L3.22 6.28a.749.749 0 1 1 1.06-1.06L8 8.939l3.72-3.719a.749.749 0 0 1 1.06 0Z"></path></svg></div></span></div><div data-line-number="69" class="child-of-line-3 child-of-line-67  react-line-number react-code-text" style="padding-right: 16px;">69</div><div data-line-number="70" class="child-of-line-3 child-of-line-67  react-line-number react-code-text" style="padding-right: 16px;">70</div><div data-line-number="71" class="child-of-line-3 child-of-line-67  react-line-number react-code-text" style="padding-right: 16px;">71</div><div data-line-number="72" class="child-of-line-3 child-of-line-67  react-line-number react-code-text" style="padding-right: 16px;">72</div><div data-line-number="73" class="child-of-line-3 child-of-line-67  react-line-number react-code-text" style="padding-right: 16px;">73</div><div data-line-number="74" class="child-of-line-3 child-of-line-67  react-line-number react-code-text" style="padding-right: 16px;">74</div><div data-line-number="75" class="child-of-line-3 child-of-line-67  react-line-number react-code-text" style="padding-right: 16px;">75</div><div data-line-number="76" class="child-of-line-3 child-of-line-67  react-line-number react-code-text" style="padding-right: 16px;">76</div><div data-line-number="77" class="child-of-line-3 child-of-line-67  react-line-number react-code-text" style="padding-right: 16px;">77</div><div data-line-number="78" class="child-of-line-3 child-of-line-67  react-line-number react-code-text" style="padding-right: 16px;">78</div><div data-line-number="79" class="child-of-line-3 child-of-line-67  react-line-number react-code-text" style="padding-right: 16px;">79</div><div data-line-number="80" class="child-of-line-3 child-of-line-67  react-line-number react-code-text" style="padding-right: 16px;">80</div><div data-line-number="81" class="child-of-line-3 child-of-line-67  react-line-number react-code-text" style="padding-right: 16px;">81</div><div data-line-number="82" class="child-of-line-3  react-line-number react-code-text" style="padding-right: 16px;">82</div><div data-line-number="83" class="child-of-line-3  react-line-number react-code-text" style="padding-right: 16px;">83</div><div data-line-number="84" class="child-of-line-3  react-line-number react-code-text" style="padding-right: 16px;">84<span class="Box-sc-g0xbh4-0 cJGaMs"><div aria-label="Collapse code section" role="button" class="Box-sc-g0xbh4-0 iGLarr"><svg aria-hidden="true" focusable="false" class="Octicon-sc-9kayk9-0" viewBox="0 0 16 16" width="16" height="16" fill="currentColor" style="display: inline-block; user-select: none; vertical-align: text-bottom; overflow: visible;"><path d="M12.78 5.22a.749.749 0 0 1 0 1.06l-4.25 4.25a.749.749 0 0 1-1.06 0L3.22 6.28a.749.749 0 1 1 1.06-1.06L8 8.939l3.72-3.719a.749.749 0 0 1 1.06 0Z"></path></svg></div></span></div><div data-line-number="85" class="child-of-line-3 child-of-line-83  react-line-number react-code-text" style="padding-right: 16px;">85</div><div data-line-number="86" class="child-of-line-3 child-of-line-83  react-line-number react-code-text" style="padding-right: 16px;">86</div><div data-line-number="87" class="child-of-line-3 child-of-line-83  react-line-number react-code-text" style="padding-right: 16px;">87</div><div data-line-number="88" class="child-of-line-3 child-of-line-83  react-line-number react-code-text" style="padding-right: 16px;">88</div><div data-line-number="89" class="child-of-line-3 child-of-line-83  react-line-number react-code-text" style="padding-right: 16px;">89</div><div data-line-number="90" class="child-of-line-3 child-of-line-83  react-line-number react-code-text" style="padding-right: 16px;">90</div><div data-line-number="91" class="child-of-line-3 child-of-line-83  react-line-number react-code-text" style="padding-right: 16px;">91</div><div data-line-number="92" class="child-of-line-3 child-of-line-83  react-line-number react-code-text" style="padding-right: 16px;">92</div><div data-line-number="93" class="child-of-line-3 child-of-line-83  react-line-number react-code-text" style="padding-right: 16px;">93</div><div data-line-number="94" class="child-of-line-3 child-of-line-83  react-line-number react-code-text" style="padding-right: 16px;">94</div><div data-line-number="95" class="child-of-line-3 child-of-line-83  react-line-number react-code-text" style="padding-right: 16px;">95</div><div data-line-number="96" class="child-of-line-3 child-of-line-83  react-line-number react-code-text" style="padding-right: 16px;">96</div><div data-line-number="97" class="child-of-line-3 child-of-line-83  react-line-number react-code-text" style="padding-right: 16px;">97</div><div data-line-number="98" class="child-of-line-3  react-line-number react-code-text" style="padding-right: 16px;">98</div><div data-line-number="99" class="child-of-line-3  react-line-number react-code-text" style="padding-right: 16px;">99</div><div data-line-number="100" class="child-of-line-3  react-line-number react-code-text" style="padding-right: 16px;">100<span class="Box-sc-g0xbh4-0 cJGaMs"><div aria-label="Collapse code section" role="button" class="Box-sc-g0xbh4-0 iGLarr"><svg aria-hidden="true" focusable="false" class="Octicon-sc-9kayk9-0" viewBox="0 0 16 16" width="16" height="16" fill="currentColor" style="display: inline-block; user-select: none; vertical-align: text-bottom; overflow: visible;"><path d="M12.78 5.22a.749.749 0 0 1 0 1.06l-4.25 4.25a.749.749 0 0 1-1.06 0L3.22 6.28a.749.749 0 1 1 1.06-1.06L8 8.939l3.72-3.719a.749.749 0 0 1 1.06 0Z"></path></svg></div></span></div><div data-line-number="101" class="child-of-line-3 child-of-line-99  react-line-number react-code-text" style="padding-right: 16px;">101</div><div data-line-number="102" class="child-of-line-3 child-of-line-99  react-line-number react-code-text" style="padding-right: 16px;">102</div><div data-line-number="103" class="child-of-line-3 child-of-line-99  react-line-number react-code-text" style="padding-right: 16px;">103</div><div data-line-number="104" class="child-of-line-3 child-of-line-99  react-line-number react-code-text" style="padding-right: 16px;">104</div><div data-line-number="105" class="child-of-line-3 child-of-line-99  react-line-number react-code-text" style="padding-right: 16px;">105</div><div data-line-number="106" class="child-of-line-3 child-of-line-99  react-line-number react-code-text" style="padding-right: 16px;">106</div><div data-line-number="107" class="child-of-line-3 child-of-line-99  react-line-number react-code-text" style="padding-right: 16px;">107</div><div data-line-number="108" class="child-of-line-3 child-of-line-99  react-line-number react-code-text" style="padding-right: 16px;">108</div><div data-line-number="109" class="child-of-line-3 child-of-line-99  react-line-number react-code-text" style="padding-right: 16px;">109</div><div data-line-number="110" class="child-of-line-3 child-of-line-99  react-line-number react-code-text" style="padding-right: 16px;">110</div><div data-line-number="111" class="child-of-line-3  react-line-number react-code-text" style="padding-right: 16px;">111</div><div data-line-number="112" class="child-of-line-3  react-line-number react-code-text" style="padding-right: 16px;">112</div><div data-line-number="113" class="child-of-line-3  react-line-number react-code-text" style="padding-right: 16px;">113<span class="Box-sc-g0xbh4-0 cJGaMs"><div aria-label="Collapse code section" role="button" class="Box-sc-g0xbh4-0 iGLarr"><svg aria-hidden="true" focusable="false" class="Octicon-sc-9kayk9-0" viewBox="0 0 16 16" width="16" height="16" fill="currentColor" style="display: inline-block; user-select: none; vertical-align: text-bottom; overflow: visible;"><path d="M12.78 5.22a.749.749 0 0 1 0 1.06l-4.25 4.25a.749.749 0 0 1-1.06 0L3.22 6.28a.749.749 0 1 1 1.06-1.06L8 8.939l3.72-3.719a.749.749 0 0 1 1.06 0Z"></path></svg></div></span></div><div data-line-number="114" class="child-of-line-3 child-of-line-112  react-line-number react-code-text" style="padding-right: 16px;">114</div><div data-line-number="115" class="child-of-line-3 child-of-line-112  react-line-number react-code-text" style="padding-right: 16px;">115</div><div data-line-number="116" class="child-of-line-3 child-of-line-112  react-line-number react-code-text" style="padding-right: 16px;">116</div><div data-line-number="117" class="child-of-line-3 child-of-line-112  react-line-number react-code-text" style="padding-right: 16px;">117</div><div data-line-number="118" class="child-of-line-3 child-of-line-112  react-line-number react-code-text" style="padding-right: 16px;">118</div><div data-line-number="119" class="child-of-line-3 child-of-line-112  react-line-number react-code-text" style="padding-right: 16px;">119</div><div data-line-number="120" class="child-of-line-3 child-of-line-112  react-line-number react-code-text" style="padding-right: 16px;">120</div></div><div class="react-no-virtualization-wrapper-lines"><div data-line-number="121" class="child-of-line-3 child-of-line-112  react-line-number react-code-text" style="padding-right: 16px;">121</div><div data-line-number="122" class="child-of-line-3  react-line-number react-code-text" style="padding-right: 16px;">122</div><div data-line-number="123" class="react-line-number react-code-text" style="padding-right: 16px;">123</div></div></div><div class="react-code-lines"><div inert="inert"><div class="react-no-virtualization-wrapper"><div id="LC1" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div "><span class="pl-k">import</span> <span class="pl-s1">java</span>.<span class="pl-s1">sql</span>.*;</div>
<div id="LC2" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div "><span class="pl-k">import</span> <span class="pl-s1">java</span>.<span class="pl-s1">util</span>.<span class="pl-s1">Scanner</span>;</div>
<div id="LC3" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div ">
</div>
<div id="LC4" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div "><span class="pl-k">public</span> <span class="pl-k">class</span> <span class="pl-smi">CollegeManagementSystem</span> {</div>
<div id="LC5" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 ">    <span class="pl-k">private</span> <span class="pl-k">static</span> <span class="pl-k">final</span> <span class="pl-smi">String</span> <span class="pl-c1">DATABASE_URL</span> = <span class="pl-s">"jdbc:mysql://localhost:3306/"</span>;</div>
<div id="LC6" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 ">    <span class="pl-k">private</span> <span class="pl-k">static</span> <span class="pl-k">final</span> <span class="pl-smi">String</span> <span class="pl-c1">DATABASE_NAME</span> = <span class="pl-s">"collegeDB"</span>;</div>
<div id="LC7" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 ">    <span class="pl-k">private</span> <span class="pl-k">static</span> <span class="pl-k">final</span> <span class="pl-smi">String</span> <span class="pl-c1">USER</span> = <span class="pl-s">"root"</span>;</div>
<div id="LC8" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 ">    <span class="pl-k">private</span> <span class="pl-k">static</span> <span class="pl-k">final</span> <span class="pl-smi">String</span> <span class="pl-c1">PASSWORD</span> = <span class="pl-s">"admin"</span>;</div>
<div id="LC9" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 ">
</div>
<div id="LC10" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 ">    <span class="pl-k">public</span> <span class="pl-k">static</span> <span class="pl-smi">void</span> <span class="pl-en">main</span>(<span class="pl-smi">String</span>[] <span class="pl-s1">args</span>) {</div>
<div id="LC11" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-9 ">        <span class="pl-k">try</span> (<span class="pl-smi">Connection</span> <span class="pl-s1">conn</span> = <span class="pl-smi">DriverManager</span>.<span class="pl-en">getConnection</span>(<span class="pl-c1">DATABASE_URL</span> + <span class="pl-s">"mysql"</span>, <span class="pl-c1">USER</span>, <span class="pl-c1">PASSWORD</span>);</div>
<div id="LC12" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-9 ">             <span class="pl-smi">Scanner</span> <span class="pl-s1">scanner</span> = <span class="pl-k">new</span> <span class="pl-smi">Scanner</span>(<span class="pl-smi">System</span>.<span class="pl-s1">in</span>)) {</div>
<div id="LC13" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-9 ">            </div>
<div id="LC14" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-9 ">            <span class="pl-en">createDatabase</span>(<span class="pl-s1">conn</span>);</div>
<div id="LC15" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-9 ">            <span class="pl-k">try</span> (<span class="pl-smi">Connection</span> <span class="pl-s1">dbConn</span> = <span class="pl-smi">DriverManager</span>.<span class="pl-en">getConnection</span>(<span class="pl-c1">DATABASE_URL</span> + <span class="pl-c1">DATABASE_NAME</span>, <span class="pl-c1">USER</span>, <span class="pl-c1">PASSWORD</span>)) {</div>
<div id="LC16" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-9 ">                <span class="pl-en">createTable</span>(<span class="pl-s1">dbConn</span>);</div>
<div id="LC17" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-9 ">                </div>
<div id="LC18" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-9 ">                <span class="pl-k">while</span> (<span class="pl-c1">true</span>) {</div>
<div id="LC19" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-9 ">                    <span class="pl-smi">System</span>.<span class="pl-s1">out</span>.<span class="pl-en">println</span>(<span class="pl-s">"Choose an operation: <span class="pl-cce">\n</span>1. Insert<span class="pl-cce">\n</span>2. Update<span class="pl-cce">\n</span>3. Delete<span class="pl-cce">\n</span>4. Display<span class="pl-cce">\n</span>5. Exit"</span>);</div>
<div id="LC20" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-9 ">                    <span class="pl-smi">int</span> <span class="pl-s1">choice</span> = <span class="pl-s1">scanner</span>.<span class="pl-en">nextInt</span>();</div>
<div id="LC21" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-9 ">                    <span class="pl-s1">scanner</span>.<span class="pl-en">nextLine</span>();</div>
<div id="LC22" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-9 ">
</div>
<div id="LC23" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-9 ">                    <span class="pl-k">switch</span> (<span class="pl-s1">choice</span>) {</div>
<div id="LC24" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-9 ">                        <span class="pl-k">case</span> <span class="pl-c1">1</span>:</div>
<div id="LC25" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-9 ">                            <span class="pl-en">insertCourse</span>(<span class="pl-s1">dbConn</span>, <span class="pl-s1">scanner</span>);</div>
<div id="LC26" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-9 ">                            <span class="pl-k">break</span>;</div>
<div id="LC27" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-9 ">                        <span class="pl-k">case</span> <span class="pl-c1">2</span>:</div>
<div id="LC28" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-9 ">                            <span class="pl-en">updateCourse</span>(<span class="pl-s1">dbConn</span>, <span class="pl-s1">scanner</span>);</div>
<div id="LC29" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-9 ">                            <span class="pl-k">break</span>;</div>
<div id="LC30" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-9 ">                        <span class="pl-k">case</span> <span class="pl-c1">3</span>:</div>
<div id="LC31" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-9 ">                            <span class="pl-en">deleteCourse</span>(<span class="pl-s1">dbConn</span>, <span class="pl-s1">scanner</span>);</div>
<div id="LC32" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-9 ">                            <span class="pl-k">break</span>;</div>
<div id="LC33" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-9 ">                        <span class="pl-k">case</span> <span class="pl-c1">4</span>:</div>
<div id="LC34" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-9 ">                            <span class="pl-en">displayCourses</span>(<span class="pl-s1">dbConn</span>);</div>
<div id="LC35" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-9 ">                            <span class="pl-k">break</span>;</div>
<div id="LC36" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-9 ">                        <span class="pl-k">case</span> <span class="pl-c1">5</span>:</div>
<div id="LC37" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-9 ">                            <span class="pl-smi">System</span>.<span class="pl-s1">out</span>.<span class="pl-en">println</span>(<span class="pl-s">"Exiting program."</span>);</div>
<div id="LC38" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-9 ">                            <span class="pl-k">return</span>;</div>
<div id="LC39" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-9 ">                        <span class="pl-k">default</span>:</div>
<div id="LC40" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-9 ">                            <span class="pl-smi">System</span>.<span class="pl-s1">out</span>.<span class="pl-en">println</span>(<span class="pl-s">"Invalid choice. Try again."</span>);</div>
<div id="LC41" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-9 ">                    }</div>
<div id="LC42" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-9 ">                }</div>
<div id="LC43" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-9 ">            }</div>
<div id="LC44" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-9 ">        } <span class="pl-k">catch</span> (<span class="pl-smi">SQLException</span> <span class="pl-s1">e</span>) {</div>
<div id="LC45" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-9 ">            <span class="pl-s1">e</span>.<span class="pl-en">printStackTrace</span>();</div>
<div id="LC46" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-9 ">        }</div>
<div id="LC47" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 ">    }</div>
<div id="LC48" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 ">
</div>
<div id="LC49" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 ">    <span class="pl-k">private</span> <span class="pl-k">static</span> <span class="pl-smi">void</span> <span class="pl-en">createDatabase</span>(<span class="pl-smi">Connection</span> <span class="pl-s1">conn</span>) <span class="pl-k">throws</span> <span class="pl-smi">SQLException</span> {</div>
<div id="LC50" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-48 ">        <span class="pl-smi">String</span> <span class="pl-s1">sql</span> = <span class="pl-s">"CREATE DATABASE IF NOT EXISTS "</span> + <span class="pl-c1">DATABASE_NAME</span>;</div>
<div id="LC51" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-48 ">        <span class="pl-k">try</span> (<span class="pl-smi">Statement</span> <span class="pl-s1">stmt</span> = <span class="pl-s1">conn</span>.<span class="pl-en">createStatement</span>()) {</div>
<div id="LC52" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-48 ">            <span class="pl-s1">stmt</span>.<span class="pl-en">executeUpdate</span>(<span class="pl-s1">sql</span>);</div>
<div id="LC53" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-48 ">            <span class="pl-smi">System</span>.<span class="pl-s1">out</span>.<span class="pl-en">println</span>(<span class="pl-s">"Database '"</span> + <span class="pl-c1">DATABASE_NAME</span> + <span class="pl-s">"' created successfully or already exists."</span>);</div>
<div id="LC54" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-48 ">        }</div>
<div id="LC55" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 ">    }</div>
<div id="LC56" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 ">
</div>
<div id="LC57" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 ">    <span class="pl-k">private</span> <span class="pl-k">static</span> <span class="pl-smi">void</span> <span class="pl-en">createTable</span>(<span class="pl-smi">Connection</span> <span class="pl-s1">conn</span>) <span class="pl-k">throws</span> <span class="pl-smi">SQLException</span> {</div>
<div id="LC58" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-56 ">        <span class="pl-smi">String</span> <span class="pl-s1">sql</span> = <span class="pl-s">"CREATE TABLE IF NOT EXISTS Courses ("</span> +</div>
<div id="LC59" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-56 ">                     <span class="pl-s">"CourseID INT AUTO_INCREMENT PRIMARY KEY, "</span> +</div>
<div id="LC60" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-56 ">                     <span class="pl-s">"Name VARCHAR(255) NOT NULL, "</span> +</div></div>
<div class="react-no-virtualization-wrapper"><div id="LC61" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-56 ">                     <span class="pl-s">"Credits INT NOT NULL)"</span>;</div>
<div id="LC62" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-56 ">        <span class="pl-k">try</span> (<span class="pl-smi">Statement</span> <span class="pl-s1">stmt</span> = <span class="pl-s1">conn</span>.<span class="pl-en">createStatement</span>()) {</div>
<div id="LC63" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-56 ">            <span class="pl-s1">stmt</span>.<span class="pl-en">executeUpdate</span>(<span class="pl-s1">sql</span>);</div>
<div id="LC64" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-56 ">            <span class="pl-smi">System</span>.<span class="pl-s1">out</span>.<span class="pl-en">println</span>(<span class="pl-s">"Table 'Courses' created successfully."</span>);</div>
<div id="LC65" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-56 ">        }</div>
<div id="LC66" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 ">    }</div>
<div id="LC67" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 ">
</div>
<div id="LC68" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 ">    <span class="pl-k">private</span> <span class="pl-k">static</span> <span class="pl-smi">void</span> <span class="pl-en">insertCourse</span>(<span class="pl-smi">Connection</span> <span class="pl-s1">conn</span>, <span class="pl-smi">Scanner</span> <span class="pl-s1">scanner</span>) <span class="pl-k">throws</span> <span class="pl-smi">SQLException</span> {</div>
<div id="LC69" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-67 ">        <span class="pl-smi">System</span>.<span class="pl-s1">out</span>.<span class="pl-en">print</span>(<span class="pl-s">"Enter Course Name: "</span>);</div>
<div id="LC70" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-67 ">        <span class="pl-smi">String</span> <span class="pl-s1">name</span> = <span class="pl-s1">scanner</span>.<span class="pl-en">nextLine</span>();</div>
<div id="LC71" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-67 ">        <span class="pl-smi">System</span>.<span class="pl-s1">out</span>.<span class="pl-en">print</span>(<span class="pl-s">"Enter Credits: "</span>);</div>
<div id="LC72" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-67 ">        <span class="pl-smi">int</span> <span class="pl-s1">credits</span> = <span class="pl-s1">scanner</span>.<span class="pl-en">nextInt</span>();</div>
<div id="LC73" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-67 ">        <span class="pl-s1">scanner</span>.<span class="pl-en">nextLine</span>();</div>
<div id="LC74" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-67 ">
</div>
<div id="LC75" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-67 ">        <span class="pl-smi">String</span> <span class="pl-s1">sql</span> = <span class="pl-s">"INSERT INTO Courses (Name, Credits) VALUES (?, ?)"</span>;</div>
<div id="LC76" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-67 ">        <span class="pl-k">try</span> (<span class="pl-smi">PreparedStatement</span> <span class="pl-s1">pstmt</span> = <span class="pl-s1">conn</span>.<span class="pl-en">prepareStatement</span>(<span class="pl-s1">sql</span>)) {</div>
<div id="LC77" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-67 ">            <span class="pl-s1">pstmt</span>.<span class="pl-en">setString</span>(<span class="pl-c1">1</span>, <span class="pl-s1">name</span>);</div>
<div id="LC78" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-67 ">            <span class="pl-s1">pstmt</span>.<span class="pl-en">setInt</span>(<span class="pl-c1">2</span>, <span class="pl-s1">credits</span>);</div>
<div id="LC79" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-67 ">            <span class="pl-s1">pstmt</span>.<span class="pl-en">executeUpdate</span>();</div>
<div id="LC80" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-67 ">            <span class="pl-smi">System</span>.<span class="pl-s1">out</span>.<span class="pl-en">println</span>(<span class="pl-s">"Record inserted successfully."</span>);</div>
<div id="LC81" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-67 ">        }</div>
<div id="LC82" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 ">    }</div>
<div id="LC83" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 ">
</div>
<div id="LC84" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 ">    <span class="pl-k">private</span> <span class="pl-k">static</span> <span class="pl-smi">void</span> <span class="pl-en">updateCourse</span>(<span class="pl-smi">Connection</span> <span class="pl-s1">conn</span>, <span class="pl-smi">Scanner</span> <span class="pl-s1">scanner</span>) <span class="pl-k">throws</span> <span class="pl-smi">SQLException</span> {</div>
<div id="LC85" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-83 ">        <span class="pl-smi">System</span>.<span class="pl-s1">out</span>.<span class="pl-en">print</span>(<span class="pl-s">"Enter CourseID to update: "</span>);</div>
<div id="LC86" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-83 ">        <span class="pl-smi">int</span> <span class="pl-s1">id</span> = <span class="pl-s1">scanner</span>.<span class="pl-en">nextInt</span>();</div>
<div id="LC87" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-83 ">        <span class="pl-smi">System</span>.<span class="pl-s1">out</span>.<span class="pl-en">print</span>(<span class="pl-s">"Enter new Credits value: "</span>);</div>
<div id="LC88" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-83 ">        <span class="pl-smi">int</span> <span class="pl-s1">credits</span> = <span class="pl-s1">scanner</span>.<span class="pl-en">nextInt</span>();</div>
<div id="LC89" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-83 ">        <span class="pl-s1">scanner</span>.<span class="pl-en">nextLine</span>();</div>
<div id="LC90" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-83 ">
</div>
<div id="LC91" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-83 ">        <span class="pl-smi">String</span> <span class="pl-s1">sql</span> = <span class="pl-s">"UPDATE Courses SET Credits = ? WHERE CourseID = ?"</span>;</div>
<div id="LC92" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-83 ">        <span class="pl-k">try</span> (<span class="pl-smi">PreparedStatement</span> <span class="pl-s1">pstmt</span> = <span class="pl-s1">conn</span>.<span class="pl-en">prepareStatement</span>(<span class="pl-s1">sql</span>)) {</div>
<div id="LC93" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-83 ">            <span class="pl-s1">pstmt</span>.<span class="pl-en">setInt</span>(<span class="pl-c1">1</span>, <span class="pl-s1">credits</span>);</div>
<div id="LC94" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-83 ">            <span class="pl-s1">pstmt</span>.<span class="pl-en">setInt</span>(<span class="pl-c1">2</span>, <span class="pl-s1">id</span>);</div>
<div id="LC95" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-83 ">            <span class="pl-smi">int</span> <span class="pl-s1">rowsUpdated</span> = <span class="pl-s1">pstmt</span>.<span class="pl-en">executeUpdate</span>();</div>
<div id="LC96" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-83 ">            <span class="pl-smi">System</span>.<span class="pl-s1">out</span>.<span class="pl-en">println</span>(<span class="pl-s1">rowsUpdated</span> &gt; <span class="pl-c1">0</span> ? <span class="pl-s">"Record updated successfully."</span> : <span class="pl-s">"CourseID not found."</span>);</div>
<div id="LC97" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-83 ">        }</div>
<div id="LC98" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 ">    }</div>
<div id="LC99" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 ">
</div>
<div id="LC100" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 ">    <span class="pl-k">private</span> <span class="pl-k">static</span> <span class="pl-smi">void</span> <span class="pl-en">deleteCourse</span>(<span class="pl-smi">Connection</span> <span class="pl-s1">conn</span>, <span class="pl-smi">Scanner</span> <span class="pl-s1">scanner</span>) <span class="pl-k">throws</span> <span class="pl-smi">SQLException</span> {</div>
<div id="LC101" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-99 ">        <span class="pl-smi">System</span>.<span class="pl-s1">out</span>.<span class="pl-en">print</span>(<span class="pl-s">"Enter CourseID to delete: "</span>);</div>
<div id="LC102" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-99 ">        <span class="pl-smi">int</span> <span class="pl-s1">id</span> = <span class="pl-s1">scanner</span>.<span class="pl-en">nextInt</span>();</div>
<div id="LC103" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-99 ">        <span class="pl-s1">scanner</span>.<span class="pl-en">nextLine</span>();</div>
<div id="LC104" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-99 ">
</div>
<div id="LC105" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-99 ">        <span class="pl-smi">String</span> <span class="pl-s1">sql</span> = <span class="pl-s">"DELETE FROM Courses WHERE CourseID = ?"</span>;</div>
<div id="LC106" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-99 ">        <span class="pl-k">try</span> (<span class="pl-smi">PreparedStatement</span> <span class="pl-s1">pstmt</span> = <span class="pl-s1">conn</span>.<span class="pl-en">prepareStatement</span>(<span class="pl-s1">sql</span>)) {</div>
<div id="LC107" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-99 ">            <span class="pl-s1">pstmt</span>.<span class="pl-en">setInt</span>(<span class="pl-c1">1</span>, <span class="pl-s1">id</span>);</div>
<div id="LC108" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-99 ">            <span class="pl-smi">int</span> <span class="pl-s1">rowsDeleted</span> = <span class="pl-s1">pstmt</span>.<span class="pl-en">executeUpdate</span>();</div>
<div id="LC109" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-99 ">            <span class="pl-smi">System</span>.<span class="pl-s1">out</span>.<span class="pl-en">println</span>(<span class="pl-s1">rowsDeleted</span> &gt; <span class="pl-c1">0</span> ? <span class="pl-s">"Record deleted successfully."</span> : <span class="pl-s">"CourseID not found."</span>);</div>
<div id="LC110" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-99 ">        }</div>
<div id="LC111" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 ">    }</div>
<div id="LC112" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 ">
</div>
<div id="LC113" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 ">    <span class="pl-k">private</span> <span class="pl-k">static</span> <span class="pl-smi">void</span> <span class="pl-en">displayCourses</span>(<span class="pl-smi">Connection</span> <span class="pl-s1">conn</span>) <span class="pl-k">throws</span> <span class="pl-smi">SQLException</span> {</div>
<div id="LC114" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-112 ">        <span class="pl-smi">String</span> <span class="pl-s1">sql</span> = <span class="pl-s">"SELECT * FROM Courses"</span>;</div>
<div id="LC115" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-112 ">        <span class="pl-k">try</span> (<span class="pl-smi">Statement</span> <span class="pl-s1">stmt</span> = <span class="pl-s1">conn</span>.<span class="pl-en">createStatement</span>(); <span class="pl-smi">ResultSet</span> <span class="pl-s1">rs</span> = <span class="pl-s1">stmt</span>.<span class="pl-en">executeQuery</span>(<span class="pl-s1">sql</span>)) {</div>
<div id="LC116" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-112 ">            <span class="pl-smi">System</span>.<span class="pl-s1">out</span>.<span class="pl-en">println</span>(<span class="pl-s">"Courses Table Records:"</span>);</div>
<div id="LC117" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-112 ">            <span class="pl-smi">System</span>.<span class="pl-s1">out</span>.<span class="pl-en">println</span>(<span class="pl-s">"-----------------------------------------"</span>);</div>
<div id="LC118" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-112 ">            <span class="pl-k">while</span> (<span class="pl-s1">rs</span>.<span class="pl-en">next</span>()) {</div>
<div id="LC119" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-112 ">                <span class="pl-smi">System</span>.<span class="pl-s1">out</span>.<span class="pl-en">println</span>(<span class="pl-s">"CourseID: "</span> + <span class="pl-s1">rs</span>.<span class="pl-en">getInt</span>(<span class="pl-s">"CourseID"</span>) + <span class="pl-s">" | Name: "</span> + <span class="pl-s1">rs</span>.<span class="pl-en">getString</span>(<span class="pl-s">"Name"</span>) + <span class="pl-s">" | Credits: "</span> + <span class="pl-s1">rs</span>.<span class="pl-en">getInt</span>(<span class="pl-s">"Credits"</span>));</div>
<div id="LC120" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-112 ">            }</div></div>
<div class="react-no-virtualization-wrapper"><div id="LC121" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 child-of-line-112 ">        }</div>
<div id="LC122" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div child-of-line-3 ">    }</div>
<div id="LC123" class="react-code-text react-code-line-contents-no-virtualization react-file-line html-div ">}</div></div></div><div class="Box-sc-g0xbh4-0 jKUklA symbol-highlight react-code-text" data-testid="sticky-line-observer"></div><div class="Box-sc-g0xbh4-0 eZZBbH symbol-highlight react-code-text" data-testid="sticky-line-observer"></div><div class="Box-sc-g0xbh4-0 jakeTR symbol-highlight react-code-text" data-testid="sticky-line-observer"></div><div class="Box-sc-g0xbh4-0 cdKFtg symbol-highlight react-code-text" data-testid="sticky-line-observer"></div><div class="Box-sc-g0xbh4-0 gTPNMQ symbol-highlight react-code-text" data-testid="sticky-line-observer"></div><div class="Box-sc-g0xbh4-0 kBARJL symbol-highlight react-code-text" data-testid="sticky-line-observer"></div><div class="Box-sc-g0xbh4-0 bSsLam symbol-highlight react-code-text" data-testid="sticky-line-observer"></div><div class="Box-sc-g0xbh4-0 bctxZK symbol-highlight react-code-text" data-testid="sticky-line-observer"></div></div><button hidden="" data-hotkey="Control+a"></button></div></div><div class="Box-sc-g0xbh4-0 fXFeWj"><div class="Box-sc-g0xbh4-0 cpJmuz"></div></div></div></div><div id="copilot-button-container"></div></div><div id="highlighted-line-menu-container"></div></div></div></section></div></div></div> <!-- --> <!-- --> </div></div></div><div class="Box-sc-g0xbh4-0"></div></div></div></div></div><div id="find-result-marks-container" class="Box-sc-g0xbh4-0 cCoXib"></div><button hidden="" data-testid="" data-hotkey-scope="read-only-cursor-text-area" data-hotkey="Control+F6,Control+Shift+F6"></button><button hidden="" data-hotkey="Control+F6,Control+Shift+F6"></button></div> <!-- --> <!-- --> <script type="application/json" id="__PRIMER_DATA_:R0:__">{"resolvedServerColorMode":"day"}</script></div>
</react-app>




  </div>

</turbo-frame>

    </main>
  </div>

  </div>

          <footer class="footer pt-8 pb-6 f6 color-fg-muted p-responsive" role="contentinfo" hidden="">
  <h2 class="sr-only">Footer</h2>

  


  <div class="d-flex flex-justify-center flex-items-center flex-column-reverse flex-lg-row flex-wrap flex-lg-nowrap">
    <div class="d-flex flex-items-center flex-shrink-0 mx-2">
      <a aria-label="Homepage" title="GitHub" class="footer-octicon mr-2" href="https://github.com/">
        <svg aria-hidden="true" height="24" viewBox="0 0 24 24" version="1.1" width="24" data-view-component="true" class="octicon octicon-mark-github">
    <path d="M12.5.75C6.146.75 1 5.896 1 12.25c0 5.089 3.292 9.387 7.863 10.91.575.101.79-.244.79-.546 0-.273-.014-1.178-.014-2.142-2.889.532-3.636-.704-3.866-1.35-.13-.331-.69-1.352-1.18-1.625-.402-.216-.977-.748-.014-.762.906-.014 1.553.834 1.769 1.179 1.035 1.74 2.688 1.25 3.349.948.1-.747.402-1.25.733-1.538-2.559-.287-5.232-1.279-5.232-5.678 0-1.25.445-2.285 1.178-3.09-.115-.288-.517-1.467.115-3.048 0 0 .963-.302 3.163 1.179.92-.259 1.897-.388 2.875-.388.977 0 1.955.13 2.875.388 2.2-1.495 3.162-1.179 3.162-1.179.633 1.581.23 2.76.115 3.048.733.805 1.179 1.825 1.179 3.09 0 4.413-2.688 5.39-5.247 5.678.417.36.776 1.05.776 2.128 0 1.538-.014 2.774-.014 3.162 0 .302.216.662.79.547C20.709 21.637 24 17.324 24 12.25 24 5.896 18.854.75 12.5.75Z"></path>
</svg>
</a>
      <span>
        © 2025 GitHub,&nbsp;Inc.
      </span>
    </div>

    <nav aria-label="Footer">
      <h3 class="sr-only" id="sr-footer-heading">Footer navigation</h3>

      <ul class="list-style-none d-flex flex-justify-center flex-wrap mb-2 mb-lg-0" aria-labelledby="sr-footer-heading">

          <li class="mx-2">
            <a data-analytics-event="{&quot;category&quot;:&quot;Footer&quot;,&quot;action&quot;:&quot;go to Terms&quot;,&quot;label&quot;:&quot;text:terms&quot;}" href="https://docs.github.com/site-policy/github-terms/github-terms-of-service" data-view-component="true" class="Link--secondary Link">Terms</a>
          </li>

          <li class="mx-2">
            <a data-analytics-event="{&quot;category&quot;:&quot;Footer&quot;,&quot;action&quot;:&quot;go to privacy&quot;,&quot;label&quot;:&quot;text:privacy&quot;}" href="https://docs.github.com/site-policy/privacy-policies/github-privacy-statement" data-view-component="true" class="Link--secondary Link">Privacy</a>
          </li>

          <li class="mx-2">
            <a data-analytics-event="{&quot;category&quot;:&quot;Footer&quot;,&quot;action&quot;:&quot;go to security&quot;,&quot;label&quot;:&quot;text:security&quot;}" href="https://github.com/security" data-view-component="true" class="Link--secondary Link">Security</a>
          </li>

          <li class="mx-2">
            <a data-analytics-event="{&quot;category&quot;:&quot;Footer&quot;,&quot;action&quot;:&quot;go to status&quot;,&quot;label&quot;:&quot;text:status&quot;}" href="https://www.githubstatus.com/" data-view-component="true" class="Link--secondary Link">Status</a>
          </li>

          <li class="mx-2">
            <a data-analytics-event="{&quot;category&quot;:&quot;Footer&quot;,&quot;action&quot;:&quot;go to docs&quot;,&quot;label&quot;:&quot;text:docs&quot;}" href="https://docs.github.com/" data-view-component="true" class="Link--secondary Link">Docs</a>
          </li>

          <li class="mx-2">
            <a data-analytics-event="{&quot;category&quot;:&quot;Footer&quot;,&quot;action&quot;:&quot;go to contact&quot;,&quot;label&quot;:&quot;text:contact&quot;}" href="https://support.github.com/?tags=dotcom-footer" data-view-component="true" class="Link--secondary Link">Contact</a>
          </li>

          <li class="mx-2">
  <cookie-consent-link data-catalyst="">
    <button type="button" class="Link--secondary underline-on-hover border-0 p-0 color-bg-transparent" data-action="click:cookie-consent-link#showConsentManagement" data-analytics-event="{&quot;location&quot;:&quot;footer&quot;,&quot;action&quot;:&quot;cookies&quot;,&quot;context&quot;:&quot;subfooter&quot;,&quot;tag&quot;:&quot;link&quot;,&quot;label&quot;:&quot;cookies_link_subfooter_footer&quot;}">
      Manage cookies
    </button>
  </cookie-consent-link>
</li>

<li class="mx-2">
  <cookie-consent-link data-catalyst="">
    <button type="button" class="Link--secondary underline-on-hover border-0 p-0 color-bg-transparent" data-action="click:cookie-consent-link#showConsentManagement" data-analytics-event="{&quot;location&quot;:&quot;footer&quot;,&quot;action&quot;:&quot;dont_share_info&quot;,&quot;context&quot;:&quot;subfooter&quot;,&quot;tag&quot;:&quot;link&quot;,&quot;label&quot;:&quot;dont_share_info_link_subfooter_footer&quot;}">
      Do not share my personal information
    </button>
  </cookie-consent-link>
</li>

      </ul>
    </nav>
  </div>
</footer>



    <ghcc-consent id="ghcc" class="position-fixed bottom-0 left-0" style="z-index: 999999" data-initial-cookie-consent-allowed="" data-cookie-consent-required="false" data-catalyst=""></ghcc-consent>



  <div id="ajax-error-message" class="ajax-error-message flash flash-error" hidden="">
    <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-alert">
    <path d="M6.457 1.047c.659-1.234 2.427-1.234 3.086 0l6.082 11.378A1.75 1.75 0 0 1 14.082 15H1.918a1.75 1.75 0 0 1-1.543-2.575Zm1.763.707a.25.25 0 0 0-.44 0L1.698 13.132a.25.25 0 0 0 .22.368h12.164a.25.25 0 0 0 .22-.368Zm.53 3.996v2.5a.75.75 0 0 1-1.5 0v-2.5a.75.75 0 0 1 1.5 0ZM9 11a1 1 0 1 1-2 0 1 1 0 0 1 2 0Z"></path>
</svg>
    <button type="button" class="flash-close js-ajax-error-dismiss" aria-label="Dismiss error">
      <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-x">
    <path d="M3.72 3.72a.75.75 0 0 1 1.06 0L8 6.94l3.22-3.22a.749.749 0 0 1 1.275.326.749.749 0 0 1-.215.734L9.06 8l3.22 3.22a.749.749 0 0 1-.326 1.275.749.749 0 0 1-.734-.215L8 9.06l-3.22 3.22a.751.751 0 0 1-1.042-.018.751.751 0 0 1-.018-1.042L6.94 8 3.72 4.78a.75.75 0 0 1 0-1.06Z"></path>
</svg>
    </button>
    You can’t perform that action at this time.
  </div>

    <template id="site-details-dialog"></template>

    <div class="Popover js-hovercard-content position-absolute" style="display: none; outline: none;">
  <div class="Popover-message Popover-message--bottom-left Popover-message--large Box color-shadow-large" style="width:360px;"></div>
</div>

    <template id="snippet-clipboard-copy-button"></template>
<template id="snippet-clipboard-copy-button-unpositioned"></template>


    <style>
      .user-mention[href$="/Lisha-Sinha"] {
        color: var(--color-user-mention-fg);
        background-color: var(--bgColor-attention-muted, var(--color-attention-subtle));
        border-radius: 2px;
        margin-left: -2px;
        margin-right: -2px;
      }
      .user-mention[href$="/Lisha-Sinha"]:before,
      .user-mention[href$="/Lisha-Sinha"]:after {
        content: '';
        display: inline-block;
        width: 2px;
      }
    </style>


    </div>

    <div id="js-global-screen-reader-notice" class="sr-only mt-n1" aria-live="polite" aria-atomic="true">web-technologies2025/CollegeManagementSystem.java at main · AmirishettyAkhila/web-technologies2025&nbsp;</div>
    <div id="js-global-screen-reader-notice-assertive" class="sr-only mt-n1" aria-live="assertive" aria-atomic="true"></div>
  


<div class="sr-only mt-n1" id="screenReaderAnnouncementDiv" role="alert" data-testid="screenReaderAnnouncement" aria-live="assertive"></div><div id="__primerPortalRoot__" style="position: absolute; top: 0px; left: 0px;"></div></body></html>