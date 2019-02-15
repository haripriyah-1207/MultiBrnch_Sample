pipeline{
node any
stages{
stage('Batch_Execution')
{
steps{
bat 'sampleBatch'
}
}
}
}