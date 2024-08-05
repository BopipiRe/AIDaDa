const { generateService } = require("@umijs/openapi");

generateService({
  requestLibPath: "import request from '@/request'",
  schemaPath: "https://aidada-backend-117511-7-1306664184.sh.run.tcloudbase.com/api/v2/api-docs",
  serversPath: "./src",
});
